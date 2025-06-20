package vulkanguide;

import org.lwjgl.BufferUtils;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.List;

public class VulkanGuideUtils {

    public static final Buffer data(List<Vertex> vectorList) {
        if (vectorList == null || vectorList.isEmpty()) {
            return BufferUtils.createFloatBuffer(0); // Return empty buffer if list is null or empty
        }

        // Assuming Vertex.sizeof() is a static method in Vertex class that returns the size of a Vertex in bytes.
        // And Vertex has methods: position(), normal(), color(), uv() which return objects with x(), y(), z() methods.
        int vertexSizeInFloats = Vertex.sizeof() / Float.BYTES; // Calculate size of one vertex in float elements
        FloatBuffer ret = BufferUtils.createFloatBuffer(vectorList.size() * vertexSizeInFloats);
        
        for(Vertex vertex : vectorList) {
            // Position
            ret.put(vertex.position.x());
            ret.put(vertex.position.y());
            ret.put(vertex.position.z());

            // Normal
            if (vertex.normal != null) { // Add null check for optional attributes
                ret.put(vertex.normal.x());
                ret.put(vertex.normal.y());
                ret.put(vertex.normal.z());
            }

            // Color
            if (vertex.color != null) { // Add null check for optional attributes
                ret.put(vertex.color.x());
                ret.put(vertex.color.y());
                ret.put(vertex.color.z());
            }

            // UV
            if (vertex.uv != null) { // Add null check for optional attributes
                 ret.put(vertex.uv.x());
                 ret.put(vertex.uv.y());
            }
        }
        ret.flip();
        return ret;
    }
}

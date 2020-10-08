package acousticfield3d.utils;

import java.nio.Buffer;
import java.nio.ByteBuffer;

public interface BufferAllocator {
    /**
     * De-allocate a direct buffer.
     *
     * @param toBeDestroyed the buffer to de-allocate (not null)
     */
    void destroyDirectBuffer(Buffer toBeDestroyed);

    /**
     * Allocate a direct ByteBuffer of the specified size.
     *
     * @param size in bytes (&ge;0)
     * @return a new direct buffer
     */
    ByteBuffer allocate(int size);
}
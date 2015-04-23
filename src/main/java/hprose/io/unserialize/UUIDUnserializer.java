/**********************************************************\
|                                                          |
|                          hprose                          |
|                                                          |
| Official WebSite: http://www.hprose.com/                 |
|                   http://www.hprose.org/                 |
|                                                          |
\**********************************************************/
/**********************************************************\
 *                                                        *
 * UUIDUnserializer.java                                  *
 *                                                        *
 * UUID unserializer class for Java.                      *
 *                                                        *
 * LastModified: Apr 22, 2015                             *
 * Author: Ma Bingyao <andot@hprose.com>                  *
 *                                                        *
\**********************************************************/

package hprose.io.unserialize;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;

final class UUIDUnserializer implements HproseUnserializer {

    public final static HproseUnserializer instance = new UUIDUnserializer();

    public final Object read(HproseReaderImpl reader, ByteBuffer buffer, Class<?> cls, Type type) throws IOException {
        return reader.readUUID(buffer);
    }

    public final Object read(HproseReaderImpl reader, InputStream stream, Class<?> cls, Type type) throws IOException {
        return reader.readUUID(stream);
    }

}

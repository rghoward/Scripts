package defpackage;

import com.intercom.twig.BuildConfig;
import io.ably.lib.util.AgentHeaderCreator;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.msgpack.core.MessagePack;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class quc {
    public final ek0.c a = ek0.a;
    public final l5a b;
    public final l5a c;

    public quc(final p0c p0cVar, final String str) {
        this.b = m5a.a(new l5a() { // from class: ouc
            @Override // defpackage.l5a
            public final /* synthetic */ Object get() {
                return this.t.a.a(p0cVar.p());
            }
        });
        this.c = m5a.a(new l5a() { // from class: muc
            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            @Override // defpackage.l5a
            public final Object get() {
                long j;
                long j2;
                long j3;
                long j4;
                long j5;
                long j6;
                long j7;
                int i = zt4.a;
                int i2 = w17.x;
                w17.a aVar = new w17.a();
                long j8 = 0;
                aVar.d = 0L;
                aVar.e = 0L;
                aVar.f = 0;
                aVar.c(str.getBytes());
                ByteBuffer byteBuffer = (ByteBuffer) aVar.c;
                byteBuffer.put((byte) 0);
                if (byteBuffer.remaining() < 8) {
                    aVar.a();
                }
                aVar.c(BuildConfig.FLAVOR.getBytes());
                aVar.a();
                byteBuffer.flip();
                if (byteBuffer.remaining() > 0) {
                    aVar.f = byteBuffer.remaining() + aVar.f;
                    switch (byteBuffer.remaining()) {
                        case 1:
                            j = 0;
                            j7 = ((long) (byteBuffer.get(0) & MessagePack.Code.EXT_TIMESTAMP)) ^ j;
                            j8 = 0;
                            aVar.d = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ aVar.d;
                            aVar.e = (Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L)) ^ aVar.e;
                            byteBuffer.position(byteBuffer.limit());
                            break;
                        case 2:
                            j2 = 0;
                            j = j2 ^ (((long) (byteBuffer.get(1) & MessagePack.Code.EXT_TIMESTAMP)) << 8);
                            j7 = ((long) (byteBuffer.get(0) & MessagePack.Code.EXT_TIMESTAMP)) ^ j;
                            j8 = 0;
                            aVar.d = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ aVar.d;
                            aVar.e = (Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L)) ^ aVar.e;
                            byteBuffer.position(byteBuffer.limit());
                            break;
                        case 3:
                            j3 = 0;
                            j2 = j3 ^ (((long) (byteBuffer.get(2) & MessagePack.Code.EXT_TIMESTAMP)) << 16);
                            j = j2 ^ (((long) (byteBuffer.get(1) & MessagePack.Code.EXT_TIMESTAMP)) << 8);
                            j7 = ((long) (byteBuffer.get(0) & MessagePack.Code.EXT_TIMESTAMP)) ^ j;
                            j8 = 0;
                            aVar.d = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ aVar.d;
                            aVar.e = (Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L)) ^ aVar.e;
                            byteBuffer.position(byteBuffer.limit());
                            break;
                        case 4:
                            j4 = 0;
                            j3 = j4 ^ (((long) (byteBuffer.get(3) & MessagePack.Code.EXT_TIMESTAMP)) << 24);
                            j2 = j3 ^ (((long) (byteBuffer.get(2) & MessagePack.Code.EXT_TIMESTAMP)) << 16);
                            j = j2 ^ (((long) (byteBuffer.get(1) & MessagePack.Code.EXT_TIMESTAMP)) << 8);
                            j7 = ((long) (byteBuffer.get(0) & MessagePack.Code.EXT_TIMESTAMP)) ^ j;
                            j8 = 0;
                            aVar.d = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ aVar.d;
                            aVar.e = (Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L)) ^ aVar.e;
                            byteBuffer.position(byteBuffer.limit());
                            break;
                        case 5:
                            j5 = 0;
                            j4 = j5 ^ (((long) (byteBuffer.get(4) & MessagePack.Code.EXT_TIMESTAMP)) << 32);
                            j3 = j4 ^ (((long) (byteBuffer.get(3) & MessagePack.Code.EXT_TIMESTAMP)) << 24);
                            j2 = j3 ^ (((long) (byteBuffer.get(2) & MessagePack.Code.EXT_TIMESTAMP)) << 16);
                            j = j2 ^ (((long) (byteBuffer.get(1) & MessagePack.Code.EXT_TIMESTAMP)) << 8);
                            j7 = ((long) (byteBuffer.get(0) & MessagePack.Code.EXT_TIMESTAMP)) ^ j;
                            j8 = 0;
                            aVar.d = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ aVar.d;
                            aVar.e = (Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L)) ^ aVar.e;
                            byteBuffer.position(byteBuffer.limit());
                            break;
                        case 6:
                            j6 = 0;
                            j5 = (((long) (byteBuffer.get(5) & MessagePack.Code.EXT_TIMESTAMP)) << 40) ^ j6;
                            j4 = j5 ^ (((long) (byteBuffer.get(4) & MessagePack.Code.EXT_TIMESTAMP)) << 32);
                            j3 = j4 ^ (((long) (byteBuffer.get(3) & MessagePack.Code.EXT_TIMESTAMP)) << 24);
                            j2 = j3 ^ (((long) (byteBuffer.get(2) & MessagePack.Code.EXT_TIMESTAMP)) << 16);
                            j = j2 ^ (((long) (byteBuffer.get(1) & MessagePack.Code.EXT_TIMESTAMP)) << 8);
                            j7 = ((long) (byteBuffer.get(0) & MessagePack.Code.EXT_TIMESTAMP)) ^ j;
                            j8 = 0;
                            aVar.d = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ aVar.d;
                            aVar.e = (Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L)) ^ aVar.e;
                            byteBuffer.position(byteBuffer.limit());
                            break;
                        case 7:
                            j6 = ((long) (byteBuffer.get(6) & MessagePack.Code.EXT_TIMESTAMP)) << 48;
                            j5 = (((long) (byteBuffer.get(5) & MessagePack.Code.EXT_TIMESTAMP)) << 40) ^ j6;
                            j4 = j5 ^ (((long) (byteBuffer.get(4) & MessagePack.Code.EXT_TIMESTAMP)) << 32);
                            j3 = j4 ^ (((long) (byteBuffer.get(3) & MessagePack.Code.EXT_TIMESTAMP)) << 24);
                            j2 = j3 ^ (((long) (byteBuffer.get(2) & MessagePack.Code.EXT_TIMESTAMP)) << 16);
                            j = j2 ^ (((long) (byteBuffer.get(1) & MessagePack.Code.EXT_TIMESTAMP)) << 8);
                            j7 = ((long) (byteBuffer.get(0) & MessagePack.Code.EXT_TIMESTAMP)) ^ j;
                            j8 = 0;
                            aVar.d = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ aVar.d;
                            aVar.e = (Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L)) ^ aVar.e;
                            byteBuffer.position(byteBuffer.limit());
                            break;
                        case 8:
                            j7 = byteBuffer.getLong();
                            aVar.d = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ aVar.d;
                            aVar.e = (Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L)) ^ aVar.e;
                            byteBuffer.position(byteBuffer.limit());
                            break;
                        case 9:
                            j8 ^= (long) (byteBuffer.get(8) & MessagePack.Code.EXT_TIMESTAMP);
                            j7 = byteBuffer.getLong();
                            aVar.d = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ aVar.d;
                            aVar.e = (Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L)) ^ aVar.e;
                            byteBuffer.position(byteBuffer.limit());
                            break;
                        case 10:
                            j8 ^= ((long) (byteBuffer.get(9) & MessagePack.Code.EXT_TIMESTAMP)) << 8;
                            j8 ^= (long) (byteBuffer.get(8) & MessagePack.Code.EXT_TIMESTAMP);
                            j7 = byteBuffer.getLong();
                            aVar.d = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ aVar.d;
                            aVar.e = (Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L)) ^ aVar.e;
                            byteBuffer.position(byteBuffer.limit());
                            break;
                        case z97.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                            j8 ^= ((long) (byteBuffer.get(10) & MessagePack.Code.EXT_TIMESTAMP)) << 16;
                            j8 ^= ((long) (byteBuffer.get(9) & MessagePack.Code.EXT_TIMESTAMP)) << 8;
                            j8 ^= (long) (byteBuffer.get(8) & MessagePack.Code.EXT_TIMESTAMP);
                            j7 = byteBuffer.getLong();
                            aVar.d = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ aVar.d;
                            aVar.e = (Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L)) ^ aVar.e;
                            byteBuffer.position(byteBuffer.limit());
                            break;
                        case 12:
                            j8 ^= ((long) (byteBuffer.get(11) & MessagePack.Code.EXT_TIMESTAMP)) << 24;
                            j8 ^= ((long) (byteBuffer.get(10) & MessagePack.Code.EXT_TIMESTAMP)) << 16;
                            j8 ^= ((long) (byteBuffer.get(9) & MessagePack.Code.EXT_TIMESTAMP)) << 8;
                            j8 ^= (long) (byteBuffer.get(8) & MessagePack.Code.EXT_TIMESTAMP);
                            j7 = byteBuffer.getLong();
                            aVar.d = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ aVar.d;
                            aVar.e = (Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L)) ^ aVar.e;
                            byteBuffer.position(byteBuffer.limit());
                            break;
                        case z97.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                            j8 ^= ((long) (byteBuffer.get(12) & MessagePack.Code.EXT_TIMESTAMP)) << 32;
                            j8 ^= ((long) (byteBuffer.get(11) & MessagePack.Code.EXT_TIMESTAMP)) << 24;
                            j8 ^= ((long) (byteBuffer.get(10) & MessagePack.Code.EXT_TIMESTAMP)) << 16;
                            j8 ^= ((long) (byteBuffer.get(9) & MessagePack.Code.EXT_TIMESTAMP)) << 8;
                            j8 ^= (long) (byteBuffer.get(8) & MessagePack.Code.EXT_TIMESTAMP);
                            j7 = byteBuffer.getLong();
                            aVar.d = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ aVar.d;
                            aVar.e = (Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L)) ^ aVar.e;
                            byteBuffer.position(byteBuffer.limit());
                            break;
                        case 14:
                            j8 ^= ((long) (byteBuffer.get(13) & MessagePack.Code.EXT_TIMESTAMP)) << 40;
                            j8 ^= ((long) (byteBuffer.get(12) & MessagePack.Code.EXT_TIMESTAMP)) << 32;
                            j8 ^= ((long) (byteBuffer.get(11) & MessagePack.Code.EXT_TIMESTAMP)) << 24;
                            j8 ^= ((long) (byteBuffer.get(10) & MessagePack.Code.EXT_TIMESTAMP)) << 16;
                            j8 ^= ((long) (byteBuffer.get(9) & MessagePack.Code.EXT_TIMESTAMP)) << 8;
                            j8 ^= (long) (byteBuffer.get(8) & MessagePack.Code.EXT_TIMESTAMP);
                            j7 = byteBuffer.getLong();
                            aVar.d = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ aVar.d;
                            aVar.e = (Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L)) ^ aVar.e;
                            byteBuffer.position(byteBuffer.limit());
                            break;
                        case h4c.e /* 15 */:
                            j8 = ((long) (byteBuffer.get(14) & MessagePack.Code.EXT_TIMESTAMP)) << 48;
                            j8 ^= ((long) (byteBuffer.get(13) & MessagePack.Code.EXT_TIMESTAMP)) << 40;
                            j8 ^= ((long) (byteBuffer.get(12) & MessagePack.Code.EXT_TIMESTAMP)) << 32;
                            j8 ^= ((long) (byteBuffer.get(11) & MessagePack.Code.EXT_TIMESTAMP)) << 24;
                            j8 ^= ((long) (byteBuffer.get(10) & MessagePack.Code.EXT_TIMESTAMP)) << 16;
                            j8 ^= ((long) (byteBuffer.get(9) & MessagePack.Code.EXT_TIMESTAMP)) << 8;
                            j8 ^= (long) (byteBuffer.get(8) & MessagePack.Code.EXT_TIMESTAMP);
                            j7 = byteBuffer.getLong();
                            aVar.d = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ aVar.d;
                            aVar.e = (Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L)) ^ aVar.e;
                            byteBuffer.position(byteBuffer.limit());
                            break;
                        default:
                            sx0.a("Should never get here.");
                            return null;
                    }
                }
                long j9 = aVar.d;
                long j10 = aVar.f;
                long j11 = j9 ^ j10;
                long j12 = j10 ^ aVar.e;
                long j13 = j11 + j12;
                long j14 = j12 + j13;
                long j15 = (j13 ^ (j13 >>> 33)) * (-49064778989728563L);
                long j16 = (j15 ^ (j15 >>> 33)) * (-4265267296055464877L);
                long j17 = (j14 ^ (j14 >>> 33)) * (-49064778989728563L);
                long j18 = (j17 ^ (j17 >>> 33)) * (-4265267296055464877L);
                long j19 = j18 ^ (j18 >>> 33);
                long j20 = (j16 ^ (j16 >>> 33)) + j19;
                aVar.d = j20;
                aVar.e = j19 + j20;
                return this.t.a.a((byte[]) new xt4.a(ByteBuffer.wrap(new byte[16]).order(ByteOrder.LITTLE_ENDIAN).putLong(aVar.d).putLong(aVar.e).array()).u.clone());
            }
        });
    }

    public final File a() {
        String str = (String) this.b.get();
        String str2 = (String) this.c.get();
        return new File(ao2.a(new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length() + 3), str, AgentHeaderCreator.AGENT_DIVIDER, str2, ".pb"));
    }
}

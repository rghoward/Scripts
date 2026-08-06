package defpackage;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import org.msgpack.core.MessagePack;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class tr2 implements ImageHeaderParser {
    public static final byte[] a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));
    public static final byte[] b = "MPF".getBytes(Charset.forName("UTF-8"));
    public static final int[] c = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements b {
        public final ByteBuffer a;

        public a(ByteBuffer byteBuffer) {
            this.a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // tr2.b
        public final int a() {
            return c() | (c() << 8);
        }

        @Override // tr2.b
        public final int b(byte[] bArr, int i) {
            ByteBuffer byteBuffer = this.a;
            int iMin = Math.min(i, byteBuffer.remaining());
            if (iMin == 0) {
                return -1;
            }
            byteBuffer.get(bArr, 0, iMin);
            return iMin;
        }

        @Override // tr2.b
        public final short c() throws b.a {
            ByteBuffer byteBuffer = this.a;
            if (byteBuffer.remaining() >= 1) {
                return (short) (byteBuffer.get() & MessagePack.Code.EXT_TIMESTAMP);
            }
            throw new b.a();
        }

        @Override // tr2.b
        public final long skip(long j) {
            ByteBuffer byteBuffer = this.a;
            int iMin = (int) Math.min(byteBuffer.remaining(), j);
            byteBuffer.position(byteBuffer.position() + iMin);
            return iMin;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface b {

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class a extends IOException {
            public a() {
                super("Unexpectedly reached end of a file");
            }
        }

        int a();

        int b(byte[] bArr, int i);

        short c();

        long skip(long j);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c implements b {
        public final InputStream a;

        public c(InputStream inputStream) {
            this.a = inputStream;
        }

        @Override // tr2.b
        public final int a() {
            return c() | (c() << 8);
        }

        @Override // tr2.b
        public final int b(byte[] bArr, int i) throws b.a {
            int i2 = 0;
            int i3 = 0;
            while (i2 < i && (i3 = this.a.read(bArr, i2, i - i2)) != -1) {
                i2 += i3;
            }
            if (i2 == 0 && i3 == -1) {
                throw new b.a();
            }
            return i2;
        }

        @Override // tr2.b
        public final short c() throws IOException {
            int i = this.a.read();
            if (i != -1) {
                return (short) i;
            }
            throw new b.a();
        }

        @Override // tr2.b
        public final long skip(long j) throws IOException {
            if (j < 0) {
                return 0L;
            }
            long j2 = j;
            while (j2 > 0) {
                InputStream inputStream = this.a;
                long jSkip = inputStream.skip(j2);
                if (jSkip > 0) {
                    j2 -= jSkip;
                } else {
                    if (inputStream.read() == -1) {
                        break;
                    }
                    j2--;
                }
            }
            return j - j2;
        }
    }

    public static int g(b bVar, o30 o30Var) {
        try {
            int iA = bVar.a();
            if ((iA & 65496) == 65496 || iA == 19789 || iA == 18761) {
                int iK = k(bVar, 225);
                if (iK != -1) {
                    byte[] bArr = (byte[]) o30Var.c(iK, byte[].class);
                    try {
                        return l(bVar, bArr, iK);
                    } finally {
                        o30Var.put(bArr);
                    }
                }
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                    return -1;
                }
            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Parser doesn't handle magic number: " + iA);
                return -1;
            }
        } catch (b.a unused) {
        }
        return -1;
    }

    public static ImageHeaderParser.ImageType h(b bVar) {
        try {
            int iA = bVar.a();
            if (iA == 65496) {
                return ImageHeaderParser.ImageType.JPEG;
            }
            int iC = (iA << 8) | bVar.c();
            if (iC == 4671814) {
                return ImageHeaderParser.ImageType.GIF;
            }
            int iC2 = (iC << 8) | bVar.c();
            if (iC2 == -1991225785) {
                bVar.skip(21L);
                try {
                    return bVar.c() >= 3 ? ImageHeaderParser.ImageType.PNG_A : ImageHeaderParser.ImageType.PNG;
                } catch (b.a unused) {
                    return ImageHeaderParser.ImageType.PNG;
                }
            }
            if (iC2 == 1380533830) {
                bVar.skip(4L);
                if (((bVar.a() << 16) | bVar.a()) != 1464156752) {
                    return ImageHeaderParser.ImageType.UNKNOWN;
                }
                int iA2 = (bVar.a() << 16) | bVar.a();
                if ((iA2 & (-256)) != 1448097792) {
                    return ImageHeaderParser.ImageType.UNKNOWN;
                }
                int i = iA2 & 255;
                if (i != 88) {
                    if (i != 76) {
                        return ImageHeaderParser.ImageType.WEBP;
                    }
                    bVar.skip(4L);
                    return (bVar.c() & 8) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
                }
                bVar.skip(4L);
                short sC = bVar.c();
                if ((sC & 2) != 0) {
                    return ImageHeaderParser.ImageType.ANIMATED_WEBP;
                }
                return (sC & 16) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
            }
            if (((bVar.a() << 16) | bVar.a()) != 1718909296) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int iA3 = (bVar.a() << 16) | bVar.a();
            if (iA3 == 1635150195) {
                return ImageHeaderParser.ImageType.ANIMATED_AVIF;
            }
            int i2 = 0;
            boolean z = iA3 == 1635150182;
            bVar.skip(4L);
            int i3 = iC2 - 16;
            if (i3 % 4 == 0) {
                while (i2 < 5 && i3 > 0) {
                    int iA4 = (bVar.a() << 16) | bVar.a();
                    if (iA4 == 1635150195) {
                        return ImageHeaderParser.ImageType.ANIMATED_AVIF;
                    }
                    if (iA4 == 1635150182) {
                        z = true;
                    }
                    i2++;
                    i3 -= 4;
                }
            }
            return z ? ImageHeaderParser.ImageType.AVIF : ImageHeaderParser.ImageType.UNKNOWN;
        } catch (b.a unused2) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
    }

    public static boolean i(b bVar, o30 o30Var) {
        boolean zJ;
        if (h(bVar) == ImageHeaderParser.ImageType.JPEG) {
            int iK = k(bVar, 226);
            while (iK > 0) {
                byte[] bArr = (byte[]) o30Var.c(iK, byte[].class);
                try {
                    int iB = bVar.b(bArr, iK);
                    if (iB != iK) {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Unable to read APP2 segment data, length: " + iK + ", actually read: " + iB);
                        }
                        zJ = false;
                    } else {
                        zJ = j(bArr, iK, b);
                    }
                    if (zJ) {
                        o30Var.put(bArr);
                        return true;
                    }
                    o30Var.put(bArr);
                    iK = k(bVar, 226);
                } catch (Throwable th) {
                    o30Var.put(bArr);
                    throw th;
                }
            }
            if (Log.isLoggable("DfltImageHeaderParser", 2)) {
                Log.v("DfltImageHeaderParser", "hasMpf: Failed to parse APP2 segment length, or no APP2 segment with MPF metadata not found");
            }
        }
        return false;
    }

    public static boolean j(byte[] bArr, int i, byte[] bArr2) {
        boolean z = (bArr == null || bArr2 == null || i <= bArr2.length) ? false : true;
        if (z) {
            for (int i2 = 0; i2 < bArr2.length; i2++) {
                if (bArr[i2] != bArr2[i2]) {
                    return false;
                }
            }
        }
        return z;
    }

    public static int k(b bVar, int i) {
        short sC;
        int iA;
        long j;
        long jSkip;
        do {
            short sC2 = bVar.c();
            if (sC2 == 255) {
                sC = bVar.c();
                if (sC != 218) {
                    if (sC != 217) {
                        iA = bVar.a() - 2;
                        if (sC == i) {
                            return iA;
                        }
                        j = iA;
                        jSkip = bVar.skip(j);
                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", "Found MARKER_EOI in " + i + " segment");
                        return -1;
                    }
                }
            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unknown segmentId=" + ((int) sC2));
                return -1;
            }
            return -1;
        } while (jSkip == j);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            StringBuilder sbB = u43.b("Unable to skip enough data, type: ", ", wanted to skip: ", ", but actually skipped: ", sC, iA);
            sbB.append(jSkip);
            Log.d("DfltImageHeaderParser", sbB.toString());
        }
        return -1;
    }

    public static int l(b bVar, byte[] bArr, int i) {
        ByteOrder byteOrder;
        int iB = bVar.b(bArr, i);
        if (iB != i) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i + ", actually read: " + iB);
                return -1;
            }
        } else if (j(bArr, i, a)) {
            ByteBuffer byteBuffer = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
            short s = byteBuffer.remaining() - 6 >= 2 ? byteBuffer.getShort(6) : (short) -1;
            if (s != 18761) {
                if (s != 19789 && Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown endianness = " + ((int) s));
                }
                byteOrder = ByteOrder.BIG_ENDIAN;
            } else {
                byteOrder = ByteOrder.LITTLE_ENDIAN;
            }
            byteBuffer.order(byteOrder);
            int i2 = byteBuffer.remaining() - 10 >= 4 ? byteBuffer.getInt(10) : -1;
            int i3 = i2 + 6;
            short s2 = byteBuffer.remaining() - i3 >= 2 ? byteBuffer.getShort(i3) : (short) -1;
            for (int i4 = 0; i4 < s2; i4++) {
                int i5 = (i4 * 12) + i2 + 8;
                short s3 = byteBuffer.remaining() - i5 >= 2 ? byteBuffer.getShort(i5) : (short) -1;
                if (s3 == 274) {
                    int i6 = i5 + 2;
                    short s4 = byteBuffer.remaining() - i6 >= 2 ? byteBuffer.getShort(i6) : (short) -1;
                    if (s4 >= 1 && s4 <= 12) {
                        int i7 = i5 + 4;
                        int i8 = byteBuffer.remaining() - i7 >= 4 ? byteBuffer.getInt(i7) : -1;
                        if (i8 >= 0) {
                            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                StringBuilder sbB = u43.b("Got tagIndex=", " tagType=", " formatCode=", i4, s3);
                                sbB.append((int) s4);
                                sbB.append(" componentCount=");
                                sbB.append(i8);
                                Log.d("DfltImageHeaderParser", sbB.toString());
                            }
                            int i9 = i8 + c[s4];
                            if (i9 <= 4) {
                                int i10 = i5 + 8;
                                if (i10 >= 0 && i10 <= byteBuffer.remaining()) {
                                    if (i9 >= 0 && i9 + i10 <= byteBuffer.remaining()) {
                                        if (byteBuffer.remaining() - i10 >= 2) {
                                            return byteBuffer.getShort(i10);
                                        }
                                        return -1;
                                    }
                                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                        Log.d("DfltImageHeaderParser", "Illegal number of bytes for TI tag data tagType=" + ((int) s3));
                                    }
                                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    Log.d("DfltImageHeaderParser", "Illegal tagValueOffset=" + i10 + " tagType=" + ((int) s3));
                                }
                            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Got byte count > 4, not orientation, continuing, formatCode=" + ((int) s4));
                            }
                        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Negative tiff component count");
                        }
                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", "Got invalid format code = " + ((int) s4));
                    }
                }
            }
        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
        }
        return -1;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final ImageHeaderParser.ImageType a(ByteBuffer byteBuffer) {
        ov9.d(byteBuffer, "Argument must not be null");
        return h(new a(byteBuffer));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final boolean b(ByteBuffer byteBuffer, o30 o30Var) {
        ov9.d(byteBuffer, "Argument must not be null");
        a aVar = new a(byteBuffer);
        ov9.d(o30Var, "Argument must not be null");
        return i(aVar, o30Var);
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final ImageHeaderParser.ImageType c(InputStream inputStream) {
        ov9.d(inputStream, "Argument must not be null");
        return h(new c(inputStream));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final int d(InputStream inputStream, o30 o30Var) {
        ov9.d(inputStream, "Argument must not be null");
        c cVar = new c(inputStream);
        ov9.d(o30Var, "Argument must not be null");
        return g(cVar, o30Var);
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final boolean e(InputStream inputStream, o30 o30Var) {
        ov9.d(inputStream, "Argument must not be null");
        c cVar = new c(inputStream);
        ov9.d(o30Var, "Argument must not be null");
        return i(cVar, o30Var);
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final int f(ByteBuffer byteBuffer, o30 o30Var) {
        ov9.d(byteBuffer, "Argument must not be null");
        a aVar = new a(byteBuffer);
        ov9.d(o30Var, "Argument must not be null");
        return g(aVar, o30Var);
    }
}

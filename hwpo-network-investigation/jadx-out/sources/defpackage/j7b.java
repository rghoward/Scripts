package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class j7b {
    public static final yd6 q = ae6.e(j7b.class);
    public ByteBuffer a;
    public byte d;
    public d7b f;
    public e7b g;
    public j7b i;
    public int j;
    public long m;
    public int n;
    public boolean o;
    public ByteBuffer b = ByteBuffer.allocate(0);
    public final a c = new a(512);
    public final ByteArrayOutputStream h = new ByteArrayOutputStream(1024);
    public final long k = 67108864;
    public final int l = 67108864;
    public boolean p = true;
    public final h7b e = new h7b(this);

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a extends ByteArrayOutputStream {
        public final byte[] h() {
            return ((ByteArrayOutputStream) this).buf;
        }

        public final synchronized ByteBuffer k() {
            return ByteBuffer.wrap(((ByteArrayOutputStream) this).buf, 0, ((ByteArrayOutputStream) this).count).asReadOnlyBuffer();
        }
    }

    public j7b() {
        f();
    }

    public final void a(ByteBuffer byteBuffer, ByteArrayOutputStream byteArrayOutputStream) throws IOException {
        h7b h7bVar = this.e;
        if (!this.o) {
            f();
            o03.a("decodeChunk() called without startDecoding()");
            return;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining() + this.b.remaining());
        byteBufferAllocate.put(this.b);
        byteBufferAllocate.put(byteBuffer);
        byteBufferAllocate.flip();
        this.b = byteBufferAllocate.duplicate();
        try {
            int iE = e(byteBufferAllocate);
            if (iE == 0) {
                iE = d(byteBufferAllocate);
            }
            a aVar = this.c;
            if (iE == 0) {
                while (byteBufferAllocate.hasRemaining() && h7bVar.a(byteBufferAllocate) == 0 && !c()) {
                    if (!this.p) {
                        byteArrayOutputStream.write(aVar.h(), this.n, aVar.size() - this.n);
                        aVar.reset();
                        h7bVar.j = 0;
                        this.n = 0;
                    }
                }
            }
            this.b = byteBufferAllocate;
            ByteBuffer byteBufferK = aVar.k();
            byteBufferK.position(this.n);
            while (byteBufferK.hasRemaining()) {
                byteArrayOutputStream.write(byteBufferK.get());
            }
            this.n = byteBufferK.limit();
        } catch (IOException e) {
            f();
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0034  */
    /* JADX WARN: Code duplicated, block: B:25:0x0038 A[Catch: all -> 0x0040, TRY_ENTER, TryCatch #0 {all -> 0x0040, blocks: (B:2:0x0000, B:4:0x0004, B:9:0x000f, B:10:0x0015, B:25:0x0038, B:26:0x003f, B:11:0x0017, B:14:0x001d, B:17:0x0024, B:20:0x002b, B:29:0x0042, B:30:0x0049), top: B:33:0x0000 }] */
    public final void b() {
        boolean zHasRemaining;
        try {
            if (!this.o) {
                throw new IOException("finishDecoding() called before startDecoding(), or called after decodeChunk() returned false");
            }
            boolean z = true;
            if (this.f != null) {
                if (this.i != null || this.e.b) {
                    z = false;
                } else if (!c()) {
                    zHasRemaining = this.b.hasRemaining();
                }
                if (z) {
                    throw new IOException("finishDecoding() called before parsing entire delta file window");
                }
                f();
            }
            zHasRemaining = this.b.hasRemaining();
            z = true ^ zHasRemaining;
            if (z) {
                throw new IOException("finishDecoding() called before parsing entire delta file window");
            }
            f();
        } catch (Throwable th) {
            f();
            throw th;
        }
    }

    public final boolean c() {
        int i = this.j;
        if (i == -3) {
            return false;
        }
        long j = this.m;
        long j2 = i;
        if (j <= j2) {
            return j == j2;
        }
        throw new IllegalStateException(String.format("Internal error: Decoded data size %d exceeds planned target file size %d", Long.valueOf(j), Integer.valueOf(this.j)));
    }

    public final int d(ByteBuffer byteBuffer) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = this.h;
        j7b j7bVar = this.i;
        if (j7bVar == null) {
            return 0;
        }
        if (this.g == null) {
            aa0.c("Internal error: custom_code_table_decoder_ is set, but custom_code_table_ is null");
            return 0;
        }
        try {
            j7bVar.a(ByteBuffer.wrap(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining()), byteArrayOutputStream);
            int size = byteArrayOutputStream.size();
            int i = e7b.C;
            if (size < i) {
                byteBuffer.position(byteBuffer.limit());
                return -2;
            }
            this.i.b();
            if (byteArrayOutputStream.size() != i) {
                throw new IOException(String.format("Decoded custom code table size (%d) does not match size of a code table (%d)", Integer.valueOf(byteArrayOutputStream.size()), Integer.valueOf(i)));
            }
            this.g = new e7b(byteArrayOutputStream.toByteArray());
            byteArrayOutputStream.reset();
            byteBuffer.position(byteBuffer.limit() - this.i.b.remaining());
            this.i = null;
            e7b e7bVar = this.g;
            short sA = this.f.a();
            h7b h7bVar = this.e;
            h7bVar.getClass();
            h7bVar.n = new f7b(e7bVar, sA);
            return 0;
        } catch (IOException e) {
            IOException iOException = new IOException("Failed to write to custom_code_table_string_");
            iOException.initCause(e);
            throw iOException;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005b  */
    public final int e(ByteBuffer byteBuffer) throws IOException {
        boolean z;
        int iPosition;
        boolean z2;
        if (this.f != null) {
            return 0;
        }
        int iRemaining = byteBuffer.remaining();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(5);
        byteBufferAllocate.put((ByteBuffer) byteBuffer.slice().limit(Math.min(5, byteBuffer.remaining())));
        byteBufferAllocate.rewind();
        byte b = byteBufferAllocate.get();
        byte b2 = byteBufferAllocate.get();
        byte b3 = byteBufferAllocate.get();
        byte b4 = byteBufferAllocate.get();
        byte b5 = byteBufferAllocate.get();
        if (iRemaining != 0) {
            z = true;
            if (iRemaining != 1) {
                if (iRemaining == 2) {
                    z2 = false;
                } else {
                    if (iRemaining != 3) {
                        this.d = b4;
                        if (b4 != 0 && b4 != 83) {
                            o03.a("Unrecognized VCDIFF format version");
                            return 0;
                        }
                    }
                    if (b3 != -60) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
                if (b2 != -61) {
                    z2 = true;
                }
            } else {
                z2 = false;
            }
            if (b == -42) {
                z = z2;
            }
        } else {
            z = false;
        }
        if (z) {
            o03.a("Did not find VCDIFF header bytes; input is not a VCDIFF delta file");
            return 0;
        }
        if (iRemaining >= 5) {
            int i = b5 & 252;
            if (i != 0) {
                throw new IOException(String.format("Unrecognized hdr_indicator flags: %02x", Integer.valueOf(i)));
            }
            if ((b5 & 1) != 0) {
                o03.a("Secondary compression is not supported");
                return 0;
            }
            if ((b5 & 2) == 0) {
                this.f = new d7b((short) 4, (short) 3);
                byteBuffer.position(byteBuffer.position() + 5);
                return 0;
            }
            i7b i7bVar = new i7b(ByteBuffer.wrap(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset() + 5, byteBuffer.remaining() - 5).slice());
            Integer numB = i7bVar.b("size of near cache");
            yd6 yd6Var = q;
            if (numB == null) {
                yd6Var.c("Failed to parse size of near cache");
                iPosition = i7bVar.a;
            } else {
                Integer numB2 = i7bVar.b("size of same cache");
                if (numB2 == null) {
                    yd6Var.c("Failed to parse size of same cache");
                    iPosition = i7bVar.a;
                } else {
                    this.g = new e7b();
                    this.h.reset();
                    this.f = new d7b(numB.shortValue(), numB2.shortValue());
                    this.i = new j7b();
                    byte[] bArrB = e7b.B.b();
                    j7b j7bVar = this.i;
                    j7bVar.getClass();
                    j7bVar.g(ByteBuffer.wrap(bArrB));
                    this.i.j = bArrB.length;
                    iPosition = i7bVar.d.duplicate().asReadOnlyBuffer().position();
                }
            }
            if (iPosition != -2) {
                byteBuffer.position(byteBuffer.position() + 5 + iPosition);
                return 0;
            }
        }
        return -2;
    }

    public final void f() {
        this.o = false;
        this.a = null;
        this.d = (byte) 0;
        this.j = -3;
        this.m = 0L;
        this.f = null;
        this.g = null;
        this.i = null;
        this.e.b();
        this.n = 0;
    }

    public final void g(ByteBuffer byteBuffer) {
        if (this.o) {
            aa0.c("startDecoding() called twice without finishDecoding()");
            return;
        }
        this.b = ByteBuffer.allocate(0);
        this.c.reset();
        f();
        this.a = byteBuffer;
        this.o = true;
    }
}

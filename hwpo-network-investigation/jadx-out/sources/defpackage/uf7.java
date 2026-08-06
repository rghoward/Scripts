package defpackage;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class uf7 {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final boolean a;

        public a(d dVar, c cVar) throws b {
            int i = cVar.a;
            ByteBuffer byteBuffer = cVar.b;
            xl7.g(i == 6 || i == 3);
            int iMin = Math.min(4, byteBuffer.remaining());
            byte[] bArr = new byte[iMin];
            byteBuffer.asReadOnlyBuffer().get(bArr);
            ot7 ot7Var = new ot7(bArr, iMin);
            if (dVar.a) {
                throw new b();
            }
            if (ot7Var.f()) {
                this.a = false;
                return;
            }
            int iG = ot7Var.g(2);
            boolean zF = ot7Var.f();
            if (dVar.b) {
                throw new b();
            }
            if (!zF) {
                this.a = true;
                return;
            }
            boolean zF2 = (iG == 3 || iG == 0) ? true : ot7Var.f();
            ot7Var.n();
            if (!dVar.d) {
                throw new b();
            }
            if (ot7Var.f()) {
                if (!dVar.e) {
                    throw new b();
                }
                ot7Var.n();
            }
            if (dVar.c) {
                throw new b();
            }
            if (iG != 3) {
                ot7Var.n();
            }
            ot7Var.o(dVar.f);
            if (iG != 2 && iG != 0 && !zF2) {
                ot7Var.o(3);
            }
            this.a = ((iG == 3 || iG == 0) ? 255 : ot7Var.g(8)) != 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class b extends Exception {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c {
        public final int a;
        public final ByteBuffer b;

        public c(int i, ByteBuffer byteBuffer) {
            this.a = i;
            this.b = byteBuffer;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class d {
        public final boolean a;
        public final boolean b;
        public final boolean c;
        public final boolean d;
        public final boolean e;
        public final int f;
        public final int g;
        public final boolean h;
        public final boolean i;
        public final boolean j;
        public final boolean k;
        public final boolean l;
        public final byte m;
        public final byte n;
        public final byte o;

        public d(c cVar) {
            int i = cVar.a;
            ByteBuffer byteBuffer = cVar.b;
            xl7.g(i == 1);
            int iRemaining = byteBuffer.remaining();
            byte[] bArr = new byte[iRemaining];
            byteBuffer.asReadOnlyBuffer().get(bArr);
            ot7 ot7Var = new ot7(bArr, iRemaining);
            this.g = ot7Var.g(3);
            ot7Var.n();
            boolean zF = ot7Var.f();
            this.a = zF;
            if (zF) {
                ot7Var.g(5);
                this.b = false;
                this.h = false;
            } else {
                if (ot7Var.f()) {
                    ot7Var.o(64);
                    if (ot7Var.f()) {
                        int i2 = 0;
                        while (!ot7Var.f()) {
                            i2++;
                        }
                        if (i2 < 32) {
                            ot7Var.o(i2);
                        }
                    }
                    boolean zF2 = ot7Var.f();
                    this.b = zF2;
                    if (zF2) {
                        ot7Var.o(47);
                    }
                } else {
                    this.b = false;
                }
                this.h = ot7Var.f();
                int iG = ot7Var.g(5);
                for (int i3 = 0; i3 <= iG; i3++) {
                    ot7Var.o(12);
                    if (i3 == 0) {
                        if (ot7Var.g(5) > 7) {
                            ot7Var.f();
                        }
                    } else if (ot7Var.g(5) > 7) {
                        ot7Var.n();
                    }
                    if (this.b) {
                        ot7Var.n();
                    }
                    if (this.h && ot7Var.f()) {
                        if (i3 == 0) {
                            ot7Var.g(4);
                        } else {
                            ot7Var.o(4);
                        }
                    }
                }
            }
            int iG2 = ot7Var.g(4);
            int iG3 = ot7Var.g(4);
            ot7Var.o(iG2 + 1);
            ot7Var.o(iG3 + 1);
            if (this.a) {
                this.c = false;
            } else {
                this.c = ot7Var.f();
            }
            if (this.c) {
                ot7Var.o(4);
                ot7Var.o(3);
            }
            ot7Var.o(3);
            if (this.a) {
                this.e = true;
                this.d = true;
                this.f = 0;
            } else {
                ot7Var.o(4);
                boolean zF3 = ot7Var.f();
                if (zF3) {
                    ot7Var.o(2);
                }
                if (ot7Var.f()) {
                    this.d = true;
                } else {
                    this.d = ot7Var.f();
                }
                if (!this.d || ot7Var.f()) {
                    this.e = true;
                } else {
                    this.e = ot7Var.f();
                }
                if (zF3) {
                    this.f = ot7Var.g(3) + 1;
                } else {
                    this.f = 0;
                }
            }
            ot7Var.o(3);
            boolean zF4 = ot7Var.f();
            if (this.g == 2 && zF4) {
                this.i = ot7Var.f();
            } else {
                this.i = false;
            }
            if (this.g != 1) {
                this.j = ot7Var.f();
            } else {
                this.j = false;
            }
            if (ot7Var.f()) {
                this.m = (byte) ot7Var.g(8);
                this.n = (byte) ot7Var.g(8);
                this.o = (byte) ot7Var.g(8);
            } else {
                this.m = (byte) 0;
                this.n = (byte) 0;
                this.o = (byte) 0;
            }
            if (this.j) {
                ot7Var.n();
                this.k = false;
                this.l = false;
            } else if (this.m == 1 && this.n == 13 && this.o == 0) {
                this.k = false;
                this.l = false;
            } else {
                ot7Var.n();
                int i4 = this.g;
                if (i4 == 0) {
                    this.k = true;
                    this.l = true;
                } else if (i4 == 1) {
                    this.k = false;
                    this.l = false;
                } else if (this.i) {
                    boolean zF5 = ot7Var.f();
                    this.k = zF5;
                    if (zF5) {
                        this.l = ot7Var.f();
                    } else {
                        this.l = false;
                    }
                } else {
                    this.k = true;
                    this.l = false;
                }
                if (this.k && this.l) {
                    ot7Var.g(2);
                }
            }
            ot7Var.n();
        }
    }

    public static ArrayList a(ByteBuffer byteBuffer) {
        int iRemaining;
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        ArrayList arrayList = new ArrayList();
        while (byteBufferAsReadOnlyBuffer.hasRemaining()) {
            try {
                byte b2 = byteBufferAsReadOnlyBuffer.get();
                int i = (b2 >> 3) & 15;
                if (((b2 >> 2) & 1) != 0) {
                    byteBufferAsReadOnlyBuffer.get();
                }
                if (((b2 >> 1) & 1) != 0) {
                    iRemaining = 0;
                    for (int i2 = 0; i2 < 8; i2++) {
                        byte b3 = byteBufferAsReadOnlyBuffer.get();
                        iRemaining |= (b3 & 127) << (i2 * 7);
                        if ((b3 & 128) == 0) {
                            break;
                        }
                    }
                } else {
                    iRemaining = byteBufferAsReadOnlyBuffer.remaining();
                }
                if (byteBufferAsReadOnlyBuffer.position() + iRemaining > byteBufferAsReadOnlyBuffer.limit()) {
                    break;
                }
                ByteBuffer byteBufferDuplicate = byteBufferAsReadOnlyBuffer.duplicate();
                byteBufferDuplicate.limit(byteBufferAsReadOnlyBuffer.position() + iRemaining);
                arrayList.add(new c(i, byteBufferDuplicate));
                byteBufferAsReadOnlyBuffer.position(byteBufferAsReadOnlyBuffer.position() + iRemaining);
            } catch (BufferUnderflowException unused) {
            }
        }
        return arrayList;
    }
}

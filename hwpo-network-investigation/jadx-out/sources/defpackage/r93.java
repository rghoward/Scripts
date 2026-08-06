package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import io.ably.lib.util.Crypto;
import io.intercom.android.sdk.m5.inbox.data.InboxPagingSource;
import java.util.ArrayList;
import java.util.List;
import org.msgpack.core.MessagePack;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class r93 implements z4a {
    public static final byte[] h = {0, 7, 8, 15};
    public static final byte[] i = {0, 119, -120, -1};
    public static final byte[] j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, MessagePack.Code.UINT8, MessagePack.Code.ARRAY32, -18, -1};
    public final Paint a;
    public final Paint b;
    public final Canvas c;
    public final b d;
    public final a e;
    public final h f;
    public Bitmap g;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final int a;
        public final int[] b;
        public final int[] c;
        public final int[] d;

        public a(int i, int[] iArr, int[] iArr2, int[] iArr3) {
            this.a = i;
            this.b = iArr;
            this.c = iArr2;
            this.d = iArr3;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;

        public b(int i, int i2, int i3, int i4, int i5, int i6) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = i6;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c {
        public final int a;
        public final boolean b;
        public final byte[] c;
        public final byte[] d;

        public c(int i, boolean z, byte[] bArr, byte[] bArr2) {
            this.a = i;
            this.b = z;
            this.c = bArr;
            this.d = bArr2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class d {
        public final int a;
        public final int b;
        public final SparseArray<e> c;

        public d(int i, int i2, SparseArray sparseArray) {
            this.a = i;
            this.b = i2;
            this.c = sparseArray;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class e {
        public final int a;
        public final int b;

        public e(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class f {
        public final int a;
        public final boolean b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final int i;
        public final SparseArray<g> j;

        public f(int i, boolean z, int i2, int i3, int i4, int i5, int i6, int i7, int i8, SparseArray sparseArray) {
            this.a = i;
            this.b = z;
            this.c = i2;
            this.d = i3;
            this.e = i4;
            this.f = i5;
            this.g = i6;
            this.h = i7;
            this.i = i8;
            this.j = sparseArray;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class g {
        public final int a;
        public final int b;

        public g(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class h {
        public final int a;
        public final int b;
        public final SparseArray<f> c = new SparseArray<>();
        public final SparseArray<a> d = new SparseArray<>();
        public final SparseArray<c> e = new SparseArray<>();
        public final SparseArray<a> f = new SparseArray<>();
        public final SparseArray<c> g = new SparseArray<>();
        public b h;
        public d i;

        public h(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    public r93(List<byte[]> list) {
        pt7 pt7Var = new pt7(list.get(0));
        int iG = pt7Var.G();
        int iG2 = pt7Var.G();
        Paint paint = new Paint();
        this.a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.c = new Canvas();
        this.d = new b(719, 575, 0, 719, 0, 575);
        this.e = new a(0, new int[]{0, -1, -16777216, -8421505}, d(), e());
        this.f = new h(iG, iG2);
    }

    public static byte[] c(int i2, int i3, ot7 ot7Var) {
        byte[] bArr = new byte[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr[i4] = (byte) ot7Var.g(i3);
        }
        return bArr;
    }

    public static int[] d() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i2 = 1; i2 < 16; i2++) {
            if (i2 < 8) {
                iArr[i2] = f(255, (i2 & 1) != 0 ? 255 : 0, (i2 & 2) != 0 ? 255 : 0, (i2 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i2] = f(255, (i2 & 1) != 0 ? 127 : 0, (i2 & 2) != 0 ? 127 : 0, (i2 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    public static int[] e() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            if (i2 < 8) {
                iArr[i2] = f(63, (i2 & 1) != 0 ? 255 : 0, (i2 & 2) != 0 ? 255 : 0, (i2 & 4) == 0 ? 0 : 255);
            } else {
                int i3 = i2 & 136;
                if (i3 == 0) {
                    iArr[i2] = f(255, ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0), ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0), ((i2 & 4) == 0 ? 0 : 85) + ((i2 & 64) == 0 ? 0 : 170));
                } else if (i3 == 8) {
                    iArr[i2] = f(127, ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0), ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0), ((i2 & 4) == 0 ? 0 : 85) + ((i2 & 64) == 0 ? 0 : 170));
                } else if (i3 == 128) {
                    iArr[i2] = f(255, ((i2 & 1) != 0 ? 43 : 0) + 127 + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + 127 + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + 127 + ((i2 & 64) == 0 ? 0 : 85));
                } else if (i3 == 136) {
                    iArr[i2] = f(255, ((i2 & 1) != 0 ? 43 : 0) + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + ((i2 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    public static int f(int i2, int i3, int i4, int i5) {
        return (i2 << 24) | (i3 << 16) | (i4 << 8) | i5;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:119:0x0203 A[LOOP:3: B:87:0x0156->B:119:0x0203, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:133:0x01ff A[SYNTHETIC] */
    public static void g(byte[] bArr, int[] iArr, int i2, int i3, int i4, Paint paint, Canvas canvas) {
        byte[] bArr2;
        char c2;
        char c3;
        int iG;
        int iG2;
        boolean z;
        int iG3;
        int iG4;
        int iG5;
        int i5;
        int i6;
        boolean z2;
        int iG6;
        ot7 ot7Var = new ot7(bArr, bArr.length);
        int i7 = i3;
        int i8 = i4;
        byte[] bArrC = null;
        byte[] bArrC2 = null;
        byte[] bArrC3 = null;
        while (ot7Var.b() != 0) {
            int i9 = 8;
            int iG7 = ot7Var.g(8);
            if (iG7 != 240) {
                int i10 = 3;
                int i11 = 2;
                int i12 = 4;
                switch (iG7) {
                    case Crypto.DEFAULT_BLOCKLENGTH /* 16 */:
                        if (i2 == 3) {
                            bArr2 = bArrC == null ? i : bArrC;
                        } else if (i2 == 2) {
                            bArr2 = bArrC3 == null ? h : bArrC3;
                        } else {
                            bArr2 = null;
                        }
                        boolean z3 = false;
                        while (true) {
                            int iG8 = ot7Var.g(2);
                            if (iG8 != 0) {
                                iG = iG8;
                                iG2 = 1;
                            } else {
                                if (ot7Var.f()) {
                                    int iG9 = ot7Var.g(3) + 3;
                                    iG = ot7Var.g(2);
                                    iG2 = iG9;
                                } else {
                                    if (ot7Var.f()) {
                                        iG2 = 1;
                                        c2 = '\b';
                                        c3 = 4;
                                    } else {
                                        int iG10 = ot7Var.g(2);
                                        if (iG10 == 0) {
                                            c2 = '\b';
                                            c3 = 4;
                                            z3 = true;
                                        } else if (iG10 == 1) {
                                            c2 = '\b';
                                            c3 = 4;
                                            iG2 = 2;
                                        } else if (iG10 == 2) {
                                            c2 = '\b';
                                            c3 = 4;
                                            iG2 = ot7Var.g(4) + 12;
                                            iG = ot7Var.g(2);
                                            z3 = z3;
                                        } else if (iG10 != 3) {
                                            z3 = z3;
                                            c2 = '\b';
                                            c3 = 4;
                                        } else {
                                            c2 = '\b';
                                            int iG11 = ot7Var.g(8) + 29;
                                            iG = ot7Var.g(2);
                                            z3 = z3;
                                            iG2 = iG11;
                                            c3 = 4;
                                        }
                                        iG = 0;
                                        iG2 = 0;
                                    }
                                    iG = 0;
                                }
                                if (iG2 == 0 && paint != null) {
                                    if (bArr2 != 0) {
                                        iG = bArr2[iG];
                                    }
                                    paint.setColor(iArr[iG]);
                                    canvas.drawRect(i7, i8, i7 + iG2, i8 + 1, paint);
                                }
                                i7 += iG2;
                                if (z3) {
                                    ot7Var.c();
                                } else {
                                    paint = paint;
                                    z3 = z3;
                                }
                            }
                            c2 = '\b';
                            c3 = 4;
                            if (iG2 == 0) {
                            }
                            i7 += iG2;
                            if (z3) {
                                ot7Var.c();
                            } else {
                                paint = paint;
                                z3 = z3;
                            }
                            break;
                        }
                        break;
                    case 17:
                        byte[] bArr3 = i2 == 3 ? bArrC2 == null ? j : bArrC2 : null;
                        boolean z4 = false;
                        while (true) {
                            int iG12 = ot7Var.g(i12);
                            if (iG12 != 0) {
                                z = z4;
                                iG5 = iG12;
                                iG3 = 1;
                            } else if (ot7Var.f()) {
                                if (ot7Var.f()) {
                                    int iG13 = ot7Var.g(i11);
                                    if (iG13 == 0) {
                                        z = z4;
                                        iG3 = 1;
                                    } else if (iG13 != 1) {
                                        if (iG13 == i11) {
                                            iG3 = ot7Var.g(i12) + 9;
                                            iG4 = ot7Var.g(i12);
                                        } else if (iG13 != i10) {
                                            z = z4;
                                            iG3 = 0;
                                        } else {
                                            iG3 = ot7Var.g(i9) + 25;
                                            iG4 = ot7Var.g(i12);
                                        }
                                        iG5 = iG4;
                                    } else {
                                        z = z4;
                                        iG3 = i11;
                                    }
                                    iG5 = 0;
                                } else {
                                    iG3 = ot7Var.g(i11) + 4;
                                    iG5 = ot7Var.g(i12);
                                }
                                z = z4;
                            } else {
                                int iG14 = ot7Var.g(i10);
                                if (iG14 != 0) {
                                    iG3 = iG14 + 2;
                                    z = z4;
                                } else {
                                    z = true;
                                    iG3 = 0;
                                }
                                iG5 = 0;
                            }
                            if (iG3 == 0 || paint == 0) {
                                i5 = i10;
                                i6 = i11;
                            } else {
                                if (bArr3 != 0) {
                                    iG5 = bArr3[iG5];
                                }
                                paint.setColor(iArr[iG5]);
                                i5 = i10;
                                i6 = 2;
                                canvas.drawRect(i7, i8, i7 + iG3, i8 + 1, paint);
                            }
                            i7 += iG3;
                            if (z) {
                                ot7Var.c();
                            } else {
                                z4 = z;
                                i10 = i5;
                                i11 = i6;
                                i12 = 4;
                                i9 = 8;
                            }
                            break;
                        }
                        break;
                    case 18:
                        boolean z5 = false;
                        while (true) {
                            int iG15 = ot7Var.g(8);
                            if (iG15 != 0) {
                                z2 = z5;
                                iG6 = 1;
                            } else if (ot7Var.f()) {
                                z2 = z5;
                                iG6 = ot7Var.g(7);
                                iG15 = ot7Var.g(8);
                            } else {
                                int iG16 = ot7Var.g(7);
                                if (iG16 != 0) {
                                    z2 = z5;
                                    iG6 = iG16;
                                    iG15 = 0;
                                } else {
                                    z2 = true;
                                    iG15 = 0;
                                    iG6 = 0;
                                }
                            }
                            if (iG6 != 0 && paint != 0) {
                                paint.setColor(iArr[iG15]);
                                canvas.drawRect(i7, i8, i7 + iG6, i8 + 1, paint);
                            }
                            i7 += iG6;
                            if (!z2) {
                                z5 = z2;
                            }
                            break;
                        }
                        break;
                    default:
                        switch (iG7) {
                            case 32:
                                bArrC3 = c(4, 4, ot7Var);
                                break;
                            case 33:
                                bArrC = c(4, 8, ot7Var);
                                break;
                            case 34:
                                bArrC2 = c(16, 8, ot7Var);
                                break;
                        }
                        break;
                }
            } else {
                i8 += 2;
                i7 = i3;
            }
        }
    }

    public static a h(ot7 ot7Var, int i2) {
        int[] iArr;
        int iG;
        int i3;
        int iG2;
        int iG3;
        int iG4;
        int i4 = 8;
        int iG5 = ot7Var.g(8);
        ot7Var.o(8);
        int i5 = 2;
        int i6 = i2 - 2;
        int i7 = 0;
        int[] iArr2 = {0, -1, -16777216, -8421505};
        int[] iArrD = d();
        int[] iArrE = e();
        while (i6 > 0) {
            int iG6 = ot7Var.g(i4);
            int iG7 = ot7Var.g(i4);
            if ((iG7 & 128) != 0) {
                iArr = iArr2;
            } else {
                iArr = (iG7 & 64) != 0 ? iArrD : iArrE;
            }
            if ((iG7 & 1) != 0) {
                iG3 = ot7Var.g(i4);
                iG4 = ot7Var.g(i4);
                iG = ot7Var.g(i4);
                iG2 = ot7Var.g(i4);
                i3 = i6 - 6;
            } else {
                int iG8 = ot7Var.g(6) << i5;
                int iG9 = ot7Var.g(4) << 4;
                iG = ot7Var.g(4) << 4;
                i3 = i6 - 4;
                iG2 = ot7Var.g(i5) << 6;
                iG3 = iG8;
                iG4 = iG9;
            }
            if (iG3 == 0) {
                iG4 = i7;
                iG = iG4;
                iG2 = 255;
            }
            double d2 = iG3;
            double d3 = iG4 - 128;
            double d4 = iG - 128;
            iArr[iG6] = f((byte) (255 - (iG2 & 255)), n6b.i((int) ((1.402d * d3) + d2), 0, 255), n6b.i((int) ((d2 - (0.34414d * d4)) - (d3 * 0.71414d)), 0, 255), n6b.i((int) ((d4 * 1.772d) + d2), 0, 255));
            i6 = i3;
            i7 = 0;
            iG5 = iG5;
            iArrE = iArrE;
            i4 = 8;
            i5 = 2;
        }
        return new a(iG5, iArr2, iArrD, iArrE);
    }

    public static c i(ot7 ot7Var) {
        byte[] bArr;
        int iG = ot7Var.g(16);
        ot7Var.o(4);
        int iG2 = ot7Var.g(2);
        boolean zF = ot7Var.f();
        ot7Var.o(1);
        byte[] bArr2 = n6b.b;
        if (iG2 != 1) {
            if (iG2 == 0) {
                int iG3 = ot7Var.g(16);
                int iG4 = ot7Var.g(16);
                if (iG3 > 0) {
                    bArr2 = new byte[iG3];
                    ot7Var.j(bArr2, iG3);
                }
                if (iG4 > 0) {
                    bArr = new byte[iG4];
                    ot7Var.j(bArr, iG4);
                }
            }
            return new c(iG, zF, bArr2, bArr);
        }
        ot7Var.o(ot7Var.g(8) * 16);
        bArr = bArr2;
        return new c(iG, zF, bArr2, bArr);
    }

    @Override // defpackage.z4a
    public final void b(byte[] bArr, int i2, int i3, z4a.b bVar, ry1<mc2> ry1Var) {
        h hVar;
        boolean z;
        mc2 mc2Var;
        char c2;
        char c3;
        char c4;
        int i4;
        int i5;
        f fVar;
        int i6;
        f fVar2;
        int iG;
        int iG2;
        int i7;
        int iG3;
        ot7 ot7Var = new ot7(bArr, i2 + i3);
        ot7Var.m(i2);
        while (true) {
            int iB = ot7Var.b();
            hVar = this.f;
            z = true;
            if (iB >= 48 && ot7Var.g(8) == 15) {
                int iG4 = ot7Var.g(8);
                int iG5 = ot7Var.g(16);
                int iG6 = ot7Var.g(16);
                int iD = ot7Var.d() + iG6;
                if (iG6 * 8 > ot7Var.b()) {
                    md6.g("DvbParser", "Data field length exceeds limit");
                    ot7Var.o(ot7Var.b());
                } else {
                    switch (iG4) {
                        case Crypto.DEFAULT_BLOCKLENGTH /* 16 */:
                            if (iG5 == hVar.a) {
                                d dVar = hVar.i;
                                ot7Var.g(8);
                                int iG7 = ot7Var.g(4);
                                int iG8 = ot7Var.g(2);
                                ot7Var.o(2);
                                int i8 = iG6 - 2;
                                SparseArray sparseArray = new SparseArray();
                                while (i8 > 0) {
                                    int iG9 = ot7Var.g(8);
                                    ot7Var.o(8);
                                    i8 -= 6;
                                    sparseArray.put(iG9, new e(ot7Var.g(16), ot7Var.g(16)));
                                }
                                d dVar2 = new d(iG7, iG8, sparseArray);
                                if (iG8 != 0) {
                                    hVar.i = dVar2;
                                    hVar.c.clear();
                                    hVar.d.clear();
                                    hVar.e.clear();
                                } else if (dVar != null && dVar.a != iG7) {
                                    hVar.i = dVar2;
                                }
                            }
                            break;
                        case 17:
                            d dVar3 = hVar.i;
                            SparseArray<f> sparseArray2 = hVar.c;
                            if (iG5 == hVar.a && dVar3 != null) {
                                int iG10 = ot7Var.g(8);
                                ot7Var.o(4);
                                boolean zF = ot7Var.f();
                                ot7Var.o(3);
                                int iG11 = ot7Var.g(16);
                                int iG12 = ot7Var.g(16);
                                ot7Var.g(3);
                                int iG13 = ot7Var.g(3);
                                ot7Var.o(2);
                                int iG14 = ot7Var.g(8);
                                int iG15 = ot7Var.g(8);
                                int iG16 = ot7Var.g(4);
                                int iG17 = ot7Var.g(2);
                                ot7Var.o(2);
                                int i9 = iG6 - 10;
                                SparseArray sparseArray3 = new SparseArray();
                                while (i9 > 0) {
                                    int iG18 = ot7Var.g(16);
                                    int iG19 = ot7Var.g(2);
                                    ot7Var.g(2);
                                    int iG20 = ot7Var.g(12);
                                    ot7Var.o(4);
                                    int iG21 = ot7Var.g(12);
                                    int i10 = i9 - 6;
                                    if (iG19 == 1 || iG19 == 2) {
                                        ot7Var.g(8);
                                        ot7Var.g(8);
                                        i9 -= 8;
                                    } else {
                                        i9 = i10;
                                    }
                                    sparseArray3.put(iG18, new g(iG20, iG21));
                                }
                                f fVar3 = new f(iG10, zF, iG11, iG12, iG13, iG14, iG15, iG16, iG17, sparseArray3);
                                if (dVar3.b == 0 && (fVar2 = sparseArray2.get(iG10)) != null) {
                                    SparseArray<g> sparseArray4 = fVar2.j;
                                    for (int i11 = 0; i11 < sparseArray4.size(); i11++) {
                                        fVar3.j.put(sparseArray4.keyAt(i11), sparseArray4.valueAt(i11));
                                    }
                                }
                                sparseArray2.put(fVar3.a, fVar3);
                            }
                            break;
                        case 18:
                            if (iG5 == hVar.a) {
                                a aVarH = h(ot7Var, iG6);
                                hVar.d.put(aVarH.a, aVarH);
                            } else if (iG5 == hVar.b) {
                                a aVarH2 = h(ot7Var, iG6);
                                hVar.f.put(aVarH2.a, aVarH2);
                            }
                            break;
                        case 19:
                            if (iG5 == hVar.a) {
                                c cVarI = i(ot7Var);
                                hVar.e.put(cVarI.a, cVarI);
                            } else if (iG5 == hVar.b) {
                                c cVarI2 = i(ot7Var);
                                hVar.g.put(cVarI2.a, cVarI2);
                            }
                            break;
                        case InboxPagingSource.PAGE_SIZE /* 20 */:
                            if (iG5 == hVar.a) {
                                ot7Var.o(4);
                                boolean zF2 = ot7Var.f();
                                ot7Var.o(3);
                                int iG22 = ot7Var.g(16);
                                int iG23 = ot7Var.g(16);
                                if (zF2) {
                                    int iG24 = ot7Var.g(16);
                                    iG = ot7Var.g(16);
                                    iG3 = ot7Var.g(16);
                                    iG2 = ot7Var.g(16);
                                    i7 = iG24;
                                } else {
                                    iG = iG22;
                                    iG2 = iG23;
                                    i7 = 0;
                                    iG3 = 0;
                                }
                                hVar.h = new b(iG22, iG23, i7, iG, iG3, iG2);
                            }
                            break;
                    }
                    ot7Var.p(iD - ot7Var.d());
                }
            }
        }
        d dVar4 = hVar.i;
        if (dVar4 == null) {
            k95.b bVar2 = k95.u;
            mc2Var = new mc2(-9223372036854775807L, -9223372036854775807L, ul8.x);
        } else {
            b bVar3 = hVar.h;
            if (bVar3 == null) {
                bVar3 = this.d;
            }
            Bitmap bitmap = this.g;
            Canvas canvas = this.c;
            if (bitmap == null || bVar3.a + 1 != bitmap.getWidth() || bVar3.b + 1 != this.g.getHeight()) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bVar3.a + 1, bVar3.b + 1, Bitmap.Config.ARGB_8888);
                this.g = bitmapCreateBitmap;
                canvas.setBitmap(bitmapCreateBitmap);
            }
            ArrayList arrayList = new ArrayList();
            SparseArray<e> sparseArray5 = dVar4.c;
            int i12 = 0;
            while (i12 < sparseArray5.size()) {
                canvas.save();
                e eVarValueAt = sparseArray5.valueAt(i12);
                f fVar4 = hVar.c.get(sparseArray5.keyAt(i12));
                int i13 = eVarValueAt.a + bVar3.c;
                int i14 = eVarValueAt.b + bVar3.e;
                int i15 = fVar4.c;
                int i16 = fVar4.f;
                int i17 = fVar4.d;
                boolean z2 = z;
                int i18 = i13 + i15;
                int i19 = i14 + i17;
                SparseArray<e> sparseArray6 = sparseArray5;
                canvas.clipRect(i13, i14, Math.min(i18, bVar3.d), Math.min(i19, bVar3.f));
                a aVar = hVar.d.get(i16);
                if (aVar == null && (aVar = hVar.f.get(i16)) == null) {
                    aVar = this.e;
                }
                SparseArray<g> sparseArray7 = fVar4.j;
                int i20 = i12;
                int i21 = 0;
                while (true) {
                    Canvas canvas2 = canvas;
                    if (i21 < sparseArray7.size()) {
                        int iKeyAt = sparseArray7.keyAt(i21);
                        g gVarValueAt = sparseArray7.valueAt(i21);
                        SparseArray<g> sparseArray8 = sparseArray7;
                        c cVar = hVar.e.get(iKeyAt);
                        if (cVar == null) {
                            cVar = hVar.g.get(iKeyAt);
                        }
                        if (cVar != null) {
                            Paint paint = cVar.b ? null : this.a;
                            int i22 = i13;
                            int i23 = fVar4.e;
                            int i24 = i22 + gVarValueAt.a;
                            int i25 = gVarValueAt.b + i14;
                            f fVar5 = fVar4;
                            int[] iArr = i23 == 3 ? aVar.d : i23 == 2 ? aVar.c : aVar.b;
                            fVar = fVar5;
                            Paint paint2 = paint;
                            canvas = canvas2;
                            i6 = i22;
                            i5 = i14;
                            g(cVar.c, iArr, i23, i24, i25, paint2, canvas);
                            g(cVar.d, iArr, i23, i24, i25 + 1, paint2, canvas);
                        } else {
                            i5 = i14;
                            fVar = fVar4;
                            canvas = canvas2;
                            i6 = i13;
                        }
                        i21++;
                        i15 = i15;
                        i14 = i5;
                        fVar4 = fVar;
                        i13 = i6;
                        hVar = hVar;
                        sparseArray7 = sparseArray8;
                        arrayList = arrayList;
                        bVar3 = bVar3;
                        i17 = i17;
                    } else {
                        b bVar4 = bVar3;
                        ArrayList arrayList2 = arrayList;
                        int i26 = i14;
                        f fVar6 = fVar4;
                        int i27 = i15;
                        int i28 = i17;
                        canvas = canvas2;
                        h hVar2 = hVar;
                        int i29 = i13;
                        if (fVar6.b) {
                            int i30 = fVar6.e;
                            if (i30 == 3) {
                                i4 = aVar.d[fVar6.g];
                                c4 = 2;
                            } else {
                                c4 = 2;
                                i4 = i30 == 2 ? aVar.c[fVar6.h] : aVar.b[fVar6.i];
                            }
                            Paint paint3 = this.b;
                            paint3.setColor(i4);
                            c2 = c4;
                            c3 = 3;
                            canvas.drawRect(i29, i26, i18, i19, paint3);
                        } else {
                            c2 = 2;
                            c3 = 3;
                        }
                        ec2.a aVar2 = new ec2.a();
                        aVar2.b = Bitmap.createBitmap(this.g, i29, i26, i27, i28);
                        aVar2.a = null;
                        float f2 = bVar4.a;
                        aVar2.h = i29 / f2;
                        aVar2.i = 0;
                        float f3 = bVar4.b;
                        aVar2.e = i26 / f3;
                        aVar2.f = 0;
                        aVar2.g = 0;
                        aVar2.l = i27 / f2;
                        aVar2.m = i28 / f3;
                        arrayList2.add(aVar2.a());
                        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                        canvas.restore();
                        z = z2;
                        arrayList = arrayList2;
                        sparseArray5 = sparseArray6;
                        i12 = i20 + 1;
                        bVar3 = bVar4;
                        hVar = hVar2;
                    }
                }
            }
            mc2Var = new mc2(-9223372036854775807L, -9223372036854775807L, arrayList);
        }
        ry1Var.accept(mc2Var);
    }

    @Override // defpackage.z4a
    public final void reset() {
        h hVar = this.f;
        hVar.c.clear();
        hVar.d.clear();
        hVar.e.clear();
        hVar.f.clear();
        hVar.g.clear();
        hVar.h = null;
        hVar.i = null;
    }
}

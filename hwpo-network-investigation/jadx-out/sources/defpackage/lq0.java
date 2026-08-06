package defpackage;

import android.content.Context;
import android.graphics.Point;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class lq0 extends gp9<nn2, h85, t75> {
    public final Context n;
    public final int o;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final Context a;

        public a(Context context) {
            context.getClass();
            this.a = context;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x0073, code lost:
        
            if (android.os.Build.VERSION.SDK_INT >= 26) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x007a, code lost:
        
            if (android.os.Build.VERSION.SDK_INT >= 34) goto L45;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final int a(defpackage.id4 r5) {
            /*
                r4 = this;
                java.lang.String r4 = r5.o
                r0 = 0
                if (r4 == 0) goto L86
                boolean r4 = defpackage.fv6.k(r4)
                if (r4 != 0) goto Ld
                goto L86
            Ld:
                java.lang.String r4 = r5.o
                java.lang.String r5 = defpackage.n6b.a
                r4.getClass()
                int r5 = r4.hashCode()
                r1 = 4
                r2 = 1
                r3 = -1
                switch(r5) {
                    case -1487656890: goto L61;
                    case -1487464693: goto L56;
                    case -1487464690: goto L4b;
                    case -1487394660: goto L40;
                    case -1487018032: goto L35;
                    case -879272239: goto L2a;
                    case -879258763: goto L1f;
                    default: goto L1e;
                }
            L1e:
                goto L6b
            L1f:
                java.lang.String r5 = "image/png"
                boolean r4 = r4.equals(r5)
                if (r4 != 0) goto L28
                goto L6b
            L28:
                r3 = 6
                goto L6b
            L2a:
                java.lang.String r5 = "image/bmp"
                boolean r4 = r4.equals(r5)
                if (r4 != 0) goto L33
                goto L6b
            L33:
                r3 = 5
                goto L6b
            L35:
                java.lang.String r5 = "image/webp"
                boolean r4 = r4.equals(r5)
                if (r4 != 0) goto L3e
                goto L6b
            L3e:
                r3 = r1
                goto L6b
            L40:
                java.lang.String r5 = "image/jpeg"
                boolean r4 = r4.equals(r5)
                if (r4 != 0) goto L49
                goto L6b
            L49:
                r3 = 3
                goto L6b
            L4b:
                java.lang.String r5 = "image/heif"
                boolean r4 = r4.equals(r5)
                if (r4 != 0) goto L54
                goto L6b
            L54:
                r3 = 2
                goto L6b
            L56:
                java.lang.String r5 = "image/heic"
                boolean r4 = r4.equals(r5)
                if (r4 != 0) goto L5f
                goto L6b
            L5f:
                r3 = r2
                goto L6b
            L61:
                java.lang.String r5 = "image/avif"
                boolean r4 = r4.equals(r5)
                if (r4 != 0) goto L6a
                goto L6b
            L6a:
                r3 = r0
            L6b:
                switch(r3) {
                    case 0: goto L76;
                    case 1: goto L6f;
                    case 2: goto L6f;
                    case 3: goto L7c;
                    case 4: goto L7c;
                    case 5: goto L7c;
                    case 6: goto L7c;
                    default: goto L6e;
                }
            L6e:
                goto L81
            L6f:
                int r4 = android.os.Build.VERSION.SDK_INT
                r5 = 26
                if (r4 < r5) goto L81
                goto L7c
            L76:
                int r4 = android.os.Build.VERSION.SDK_INT
                r5 = 34
                if (r4 < r5) goto L81
            L7c:
                int r4 = androidx.media3.exoplayer.l.r(r1, r0, r0, r0)
                return r4
            L81:
                int r4 = androidx.media3.exoplayer.l.r(r2, r0, r0, r0)
                return r4
            L86:
                int r4 = androidx.media3.exoplayer.l.r(r0, r0, r0, r0)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: lq0.a.a(id4):int");
        }
    }

    public lq0(Context context) {
        super(new nn2[1], new h85[1]);
        this.n = context;
        this.o = -1;
    }

    @Override // defpackage.gp9
    public final nn2 g() {
        return new nn2(1);
    }

    @Override // defpackage.gp9
    public final on2 h() {
        return new kq0(this);
    }

    @Override // defpackage.gp9
    public final mn2 i(Throwable th) {
        return new t75("Unexpected decode error", th);
    }

    @Override // defpackage.gp9
    public final mn2 j(nn2 nn2Var, on2 on2Var, boolean z) {
        h85 h85Var = (h85) on2Var;
        ByteBuffer byteBuffer = nn2Var.w;
        byteBuffer.getClass();
        xl7.r(byteBuffer.hasArray());
        xl7.g(byteBuffer.arrayOffset() == 0);
        try {
            int iMax = this.o;
            if (iMax == -1) {
                Context context = this.n;
                if (context != null) {
                    Point pointV = n6b.v(context);
                    int i = pointV.x;
                    int i2 = pointV.y;
                    id4 id4Var = nn2Var.u;
                    if (id4Var != null) {
                        int i3 = id4Var.N;
                        if (i3 != -1) {
                            i *= i3;
                        }
                        int i4 = id4Var.O;
                        if (i4 != -1) {
                            i2 *= i4;
                        }
                    }
                    iMax = (Math.max(i, i2) * 2) - 1;
                } else {
                    iMax = 4096;
                }
            }
            h85Var.w = uq0.a(byteBuffer.array(), byteBuffer.remaining(), iMax);
            h85Var.u = nn2Var.y;
            return null;
        } catch (ut7 e) {
            return new t75("Could not decode image data with BitmapFactory.", e);
        } catch (IOException e2) {
            return new t75(e2);
        }
    }
}

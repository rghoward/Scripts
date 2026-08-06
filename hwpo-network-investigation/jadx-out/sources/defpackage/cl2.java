package defpackage;

import com.intercom.twig.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class cl2 implements ojb {
    public final yg2 a;
    public final int b;
    public final int c;
    public final int d;
    public final a e;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements ag7 {
        public a() {
        }

        @Override // defpackage.ag7
        public final int a(int i) {
            cl2 cl2Var = cl2.this;
            if (i <= cl2Var.b - 1) {
                return i;
            }
            if (i <= cl2Var.c - 1) {
                return i - 1;
            }
            int i2 = cl2Var.d;
            return i <= i2 + 1 ? i - 2 : i2;
        }

        @Override // defpackage.ag7
        public final int b(int i) {
            cl2 cl2Var = cl2.this;
            if (i < cl2Var.b) {
                return i;
            }
            if (i < cl2Var.c) {
                return i + 1;
            }
            int i2 = cl2Var.d;
            return i <= i2 ? i + 2 : i2 + 2;
        }
    }

    public cl2(yg2 yg2Var) {
        this.a = yg2Var;
        String str = yg2Var.a;
        char c = yg2Var.b;
        this.b = z2a.t(str, c, 0, 6);
        this.c = z2a.y(str, c, 0, 6);
        this.d = yg2Var.c.length();
        this.e = new a();
    }

    @Override // defpackage.ojb
    public final mva a(iw iwVar) {
        int length = iwVar.u.length();
        String strSubstring = iwVar.u;
        int i = 0;
        int i2 = this.d;
        if (length > i2) {
            fg5 fg5VarJ = uh8.j(0, i2);
            strSubstring.getClass();
            fg5VarJ.getClass();
            strSubstring = strSubstring.substring(fg5VarJ.t, fg5VarJ.u + 1);
        }
        String string = BuildConfig.FLAVOR;
        int i3 = 0;
        while (i < strSubstring.length()) {
            int i4 = i3 + 1;
            string = string + strSubstring.charAt(i);
            if (i4 == this.b || i3 + 2 == this.c) {
                StringBuilder sbA = bl2.a(string);
                sbA.append(this.a.b);
                string = sbA.toString();
            }
            i++;
            i3 = i4;
        }
        return new mva(new iw(string), this.e);
    }
}

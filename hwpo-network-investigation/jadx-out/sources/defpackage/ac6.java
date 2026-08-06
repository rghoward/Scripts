package defpackage;

import java.io.PrintWriter;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ac6 extends zb6 {
    public final m76 a;
    public final b b;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a<D> extends k27<D> {
        @Override // defpackage.kb6
        public final void g() {
            throw null;
        }

        @Override // defpackage.kb6
        public final void h() {
            throw null;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #0 : ");
            sb.append("null");
            sb.append("}}");
            return sb.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class b extends mhb {
        public static final a u = new a();
        public final fx9<a> t = new fx9<>();

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static class a implements thb.c {
            @Override // thb.c
            public final <T extends mhb> T create(Class<T> cls) {
                return new b();
            }
        }

        @Override // defpackage.mhb
        public final void onCleared() {
            super.onCleared();
            fx9<a> fx9Var = this.t;
            if (fx9Var.f() > 0) {
                fx9Var.g(0).getClass();
                throw null;
            }
            int i = fx9Var.w;
            Object[] objArr = fx9Var.v;
            for (int i2 = 0; i2 < i; i2++) {
                objArr[i2] = null;
            }
            fx9Var.w = 0;
            fx9Var.t = false;
        }
    }

    public ac6(m76 m76Var, vhb vhbVar) {
        this.a = m76Var;
        vhbVar.getClass();
        lb2.a aVar = lb2.a.b;
        aVar.getClass();
        uhb uhbVar = new uhb(vhbVar, b.u, aVar);
        sd1 sd1VarA = ll8.a(b.class);
        String strE = sd1VarA.e();
        if (strE != null) {
            this.b = (b) uhbVar.a(sd1VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strE));
        } else {
            z90.a("Local and anonymous classes can not be ViewModels");
            throw null;
        }
    }

    @Deprecated
    public final void b(String str, PrintWriter printWriter) {
        fx9<a> fx9Var = this.b.t;
        if (fx9Var.f() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            if (fx9Var.f() <= 0) {
                return;
            }
            a aVarG = fx9Var.g(0);
            printWriter.print(str);
            printWriter.print("  #");
            printWriter.print(fx9Var.d(0));
            printWriter.print(": ");
            printWriter.println(aVarG.toString());
            printWriter.print(str2);
            printWriter.print("mId=");
            printWriter.print(0);
            printWriter.print(" mArgs=");
            printWriter.println((Object) null);
            printWriter.print(str2);
            printWriter.print("mLoader=");
            printWriter.println((Object) null);
            throw null;
        }
    }

    public final String toString() {
        int iLastIndexOf;
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        m76 m76Var = this.a;
        String simpleName = m76Var.getClass().getSimpleName();
        if (simpleName.length() <= 0 && (iLastIndexOf = (simpleName = m76Var.getClass().getName()).lastIndexOf(46)) > 0) {
            simpleName = simpleName.substring(iLastIndexOf + 1);
        }
        sb.append(simpleName);
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(m76Var)));
        sb.append("}}");
        return sb.toString();
    }
}

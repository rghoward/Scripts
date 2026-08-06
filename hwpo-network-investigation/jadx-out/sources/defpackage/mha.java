package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public interface mha {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements mha {
        public static final a a = new a();

        @Override // defpackage.mha
        public final float a() {
            return Float.NaN;
        }

        @Override // defpackage.mha
        public final long c() {
            int i = uh1.l;
            return uh1.k;
        }

        @Override // defpackage.mha
        public final fx0 e() {
            return null;
        }
    }

    float a();

    default mha b(mha mhaVar) {
        boolean z = mhaVar instanceof hx0;
        if (!z || !(this instanceof hx0)) {
            if (!z || (this instanceof hx0)) {
                return (z || !(this instanceof hx0)) ? mhaVar.d(new va3(2, this)) : this;
            }
            return mhaVar;
        }
        hx0 hx0Var = (hx0) mhaVar;
        cl9 cl9Var = hx0Var.a;
        float f = hx0Var.b;
        if (Float.isNaN(f)) {
            f = ((hx0) this).b;
        }
        return new hx0(cl9Var, f);
    }

    long c();

    default mha d(mh4<? extends mha> mh4Var) {
        return !equals(a.a) ? this : mh4Var.invoke();
    }

    fx0 e();
}

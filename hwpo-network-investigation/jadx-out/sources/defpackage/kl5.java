package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class kl5 extends hd6 implements e33, ja5 {
    public ll5 z;

    @Override // defpackage.ja5
    public final rb7 b() {
        return null;
    }

    @Override // defpackage.e33
    public final void dispose() {
        p().t0(this);
    }

    public el5 getParent() {
        return p();
    }

    @Override // defpackage.ja5
    public final boolean h() {
        return true;
    }

    public final ll5 p() {
        ll5 ll5Var = this.z;
        if (ll5Var != null) {
            return ll5Var;
        }
        xj5.e("job");
        throw null;
    }

    public abstract boolean q();

    public abstract void r(Throwable th);

    @Override // defpackage.hd6
    public final String toString() {
        return getClass().getSimpleName() + '@' + ym2.c(this) + "[job@" + ym2.c(p()) + ']';
    }
}

package defpackage;

import com.intercom.twig.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class wf1 extends vx6<zf1> {
    public final qi t;
    public final boolean u;
    public final int v;
    public final wv<Float> w;

    public wf1(qi qiVar, boolean z, int i, a04 a04Var) {
        this.t = qiVar;
        this.u = z;
        this.v = i;
        this.w = a04Var;
    }

    @Override // defpackage.vx6
    public final ox6.c a() {
        return new zf1(this.t, this.u, this.v, this.w);
    }

    @Override // defpackage.vx6
    public final void b(ox6.c cVar) {
        zf1 zf1Var = (zf1) cVar;
        qi qiVar = this.t;
        zf1Var.J = qiVar;
        zf1Var.K = this.u;
        wv<Float> wvVar = this.w;
        zf1Var.M = wvVar;
        int i = zf1Var.L;
        int i2 = this.v;
        if (i == i2) {
            return;
        }
        zf1Var.L = i2;
        oy0.d(zf1Var.Q1(), null, null, new bg1(qiVar, wvVar, null), 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wf1)) {
            return false;
        }
        wf1 wf1Var = (wf1) obj;
        return xj5.a(this.t, wf1Var.t) && this.u == wf1Var.u && this.v == wf1Var.v && xj5.a(this.w, wf1Var.w);
    }

    public final int hashCode() {
        return this.w.hashCode() + os2.a(this.v, uo2.a(this.t.hashCode() * 31, this.u, 31), 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ClockDialModifier(state=");
        sb.append(this.t);
        sb.append(", autoSwitchToMinute=");
        sb.append(this.u);
        sb.append(", selection=");
        int i = this.v;
        if (i == 0) {
            str = "Hour";
        } else {
            str = i == 1 ? "Minute" : BuildConfig.FLAVOR;
        }
        sb.append((Object) str);
        sb.append(", animationSpec=");
        sb.append(this.w);
        sb.append(')');
        return sb.toString();
    }
}

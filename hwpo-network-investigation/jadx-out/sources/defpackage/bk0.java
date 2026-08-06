package defpackage;

import defpackage.qj3;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class bk0<T extends qj3> implements t55<T> {
    public List<Integer> a;
    public ArrayList b;
    public String c;
    public mrb.a d;
    public boolean e;
    public transient nab f;
    public h66.b g;
    public float h;
    public float i;
    public boolean j;
    public boolean k;
    public sf6 l;
    public float m;
    public boolean n;

    @Override // defpackage.t55
    public final boolean C() {
        return this.j;
    }

    @Override // defpackage.t55
    public final mrb.a G() {
        return this.d;
    }

    @Override // defpackage.t55
    public final sf6 I() {
        return this.l;
    }

    @Override // defpackage.t55
    public final int J() {
        return this.a.get(0).intValue();
    }

    @Override // defpackage.t55
    public final boolean K() {
        return this.e;
    }

    @Override // defpackage.t55
    public T L(float f, float f2) {
        return (T) e(f, f2);
    }

    @Override // defpackage.t55
    public final int a(int i) {
        List<Integer> list = this.a;
        return list.get(i % list.size()).intValue();
    }

    @Override // defpackage.t55
    public final boolean f() {
        return this.k;
    }

    @Override // defpackage.t55
    public final h66.b g() {
        return this.g;
    }

    @Override // defpackage.t55
    public final String h() {
        return this.c;
    }

    @Override // defpackage.t55
    public final boolean isVisible() {
        return this.n;
    }

    @Override // defpackage.t55
    public final float k() {
        return this.m;
    }

    @Override // defpackage.t55
    public final nab l() {
        return r() ? t6b.g : this.f;
    }

    @Override // defpackage.t55
    public final void m(nab nabVar) {
        if (nabVar == null) {
            return;
        }
        this.f = nabVar;
    }

    @Override // defpackage.t55
    public final float n() {
        return this.i;
    }

    @Override // defpackage.t55
    public final float p() {
        return this.h;
    }

    @Override // defpackage.t55
    public final boolean r() {
        return this.f == null;
    }

    @Override // defpackage.t55
    public final void s() {
        this.e = true;
    }

    @Override // defpackage.t55
    public final void t() {
        this.j = false;
    }

    @Override // defpackage.t55
    public final int u(int i) {
        ArrayList arrayList = this.b;
        return ((Integer) arrayList.get(i % arrayList.size())).intValue();
    }

    @Override // defpackage.t55
    public final List<Integer> v() {
        return this.a;
    }
}

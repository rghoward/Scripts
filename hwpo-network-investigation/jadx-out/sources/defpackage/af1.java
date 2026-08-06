package defpackage;

import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class af1 extends m0 {
    public a58 f0;
    public jb5 g0;

    public af1() {
        throw null;
    }

    @Override // defpackage.nb5
    public final void X0() {
        s2(true);
    }

    @Override // defpackage.m0, defpackage.nb5
    public final void b0(to toVar, s48 s48Var) {
        ArrayList arrayList = toVar.a;
        super.b0(toVar, s48Var);
        if (s48Var != s48.u) {
            if (s48Var != s48.v || this.g0 == null) {
                return;
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                jb5 jb5Var = (jb5) arrayList.get(i);
                if (jb5Var.i && jb5Var != this.g0) {
                    s2(true);
                    return;
                }
            }
            return;
        }
        if (this.g0 == null) {
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (lb5.d((jb5) arrayList.get(i2))) {
                    jb5 jb5Var2 = (jb5) arrayList.get(0);
                    jb5Var2.i = true;
                    this.g0 = jb5Var2;
                    if (this.O) {
                        l2(jb5Var2);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        int size3 = arrayList.size();
        for (int i3 = 0; i3 < size3; i3++) {
            jb5 jb5Var3 = (jb5) arrayList.get(i3);
            if (jb5Var3.i || !jb5Var3.h || jb5Var3.d) {
                float f = ((lgb) ku1.a(this, qu1.t)).f();
                int size4 = arrayList.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    jb5 jb5Var4 = (jb5) arrayList.get(i4);
                    long j = jb5Var4.c;
                    jb5 jb5Var5 = this.g0;
                    jb5Var5.getClass();
                    boolean z = Math.abs(vf7.c(vf7.d(j, jb5Var5.c))) > f;
                    if (jb5Var4.i || z) {
                        s2(true);
                        return;
                    }
                }
                return;
            }
        }
        ((jb5) arrayList.get(0)).i = true;
        if (this.O) {
            jb5 jb5Var6 = this.g0;
            jb5Var6.getClass();
            k2(jb5Var6.c, true);
            this.P.invoke();
        }
        this.g0 = null;
    }

    @Override // defpackage.m0, defpackage.g58
    public final void c0(r48 r48Var, s48 s48Var, long j) {
        super.c0(r48Var, s48Var, j);
        if (s48Var != s48.u) {
            if (s48Var != s48.v || this.f0 == null) {
                return;
            }
            List<a58> list = r48Var.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                a58 a58Var = list.get(i);
                if (a58Var.b() && a58Var != this.f0) {
                    s2(false);
                    return;
                }
            }
            return;
        }
        if (this.f0 == null) {
            if (o8a.e(r48Var, true)) {
                a58 a58Var2 = r48Var.a.get(0);
                a58Var2.a();
                this.f0 = a58Var2;
                if (this.O) {
                    m2(a58Var2);
                    return;
                }
                return;
            }
            return;
        }
        List<a58> list2 = r48Var.a;
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (!z69.f(list2.get(i2))) {
                long jI2 = i2(j);
                int size3 = list2.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    a58 a58Var3 = list2.get(i3);
                    if (a58Var3.b() || z69.i(a58Var3, j, jI2)) {
                        s2(false);
                        return;
                    }
                }
                return;
            }
        }
        list2.get(0).a();
        if (this.O) {
            a58 a58Var4 = this.f0;
            a58Var4.getClass();
            k2(a58Var4.c, false);
            this.P.invoke();
        }
        this.f0 = null;
    }

    @Override // defpackage.m0
    public final boolean p2(KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.m0
    public final void q2(KeyEvent keyEvent) {
        this.P.invoke();
    }

    public final void s2(boolean z) {
        if (z) {
            this.g0 = null;
        } else {
            this.f0 = null;
        }
        j2(z);
    }

    @Override // defpackage.m0, defpackage.g58
    public final void t0() {
        super.t0();
        s2(false);
    }
}

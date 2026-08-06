package defpackage;

import android.content.Context;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class bj8 implements ug5.a {
    public final k85 a;
    public final List<ug5> b;
    public final int c;
    public final k85 d;
    public final br9 e;
    public final nm3 f;
    public final boolean g;

    /* JADX WARN: Multi-variable type inference failed */
    public bj8(k85 k85Var, List<? extends ug5> list, int i, k85 k85Var2, br9 br9Var, nm3 nm3Var, boolean z) {
        this.a = k85Var;
        this.b = list;
        this.c = i;
        this.d = k85Var2;
        this.e = br9Var;
        this.f = nm3Var;
        this.g = z;
    }

    public final void a(k85 k85Var, ug5 ug5Var) {
        Context context = k85Var.a;
        k85 k85Var2 = this.a;
        if (context != k85Var2.a) {
            qz1.a(ug5Var, "' cannot modify the request's context.", "Interceptor '");
            return;
        }
        if (k85Var.b == pd7.b) {
            qz1.a(ug5Var, "' cannot set the request's data to null.", "Interceptor '");
            return;
        }
        if (k85Var.c != k85Var2.c) {
            qz1.a(ug5Var, "' cannot modify the request's target.", "Interceptor '");
        } else if (k85Var.x != k85Var2.x) {
            qz1.a(ug5Var, "' cannot modify the request's lifecycle.", "Interceptor '");
        } else {
            if (k85Var.y == k85Var2.y) {
                return;
            }
            qz1.a(ug5Var, "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.", "Interceptor '");
        }
    }

    @Override // ug5.a
    public final k85 b() {
        return this.d;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(k85 k85Var, u02 u02Var) throws Throwable {
        zi8 zi8Var;
        ug5 ug5Var;
        Object objA;
        if (u02Var instanceof zi8) {
            zi8Var = (zi8) u02Var;
            int i = zi8Var.x;
            if ((i & Integer.MIN_VALUE) != 0) {
                zi8Var.x = i - Integer.MIN_VALUE;
            } else {
                zi8Var = new zi8(this, u02Var);
            }
        } else {
            zi8Var = new zi8(this, u02Var);
        }
        Object obj = zi8Var.v;
        int i2 = zi8Var.x;
        if (i2 == 0) {
            dv8.b(obj);
            List<ug5> list = this.b;
            int i3 = this.c;
            if (i3 > 0) {
                a(k85Var, list.get(i3 - 1));
            }
            ug5Var = list.get(i3);
            bj8 bj8Var = new bj8(this.a, this.b, i3 + 1, k85Var, this.e, this.f, this.g);
            zi8Var.t = this;
            zi8Var.u = ug5Var;
            zi8Var.x = 1;
            objA = ug5Var.a(bj8Var, zi8Var);
            v72 v72Var = v72.t;
            if (objA == v72Var) {
                return v72Var;
            }
        } else {
            if (i2 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ug5 ug5Var2 = zi8Var.u;
            bj8 bj8Var2 = zi8Var.t;
            dv8.b(obj);
            ug5Var = ug5Var2;
            this = bj8Var2;
            objA = obj;
        }
        l85 l85Var = (l85) objA;
        this.a(l85Var.b(), ug5Var);
        return l85Var;
    }
}

package defpackage;

import androidx.fragment.app.f;
import androidx.fragment.app.l;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class vn2 {
    public final hy8 a;
    public final l b;
    public final eb c;

    public vn2(hy8 hy8Var, l lVar, eb ebVar) {
        this.a = hy8Var;
        this.b = lVar;
        this.c = ebVar;
    }

    public final void a(sn2 sn2Var, boolean z) {
        sf4 fn1Var;
        if (sn2Var instanceof sn2.a) {
            fn1Var = new en1(((sn2.a) sn2Var).a, true);
        } else if (!(sn2Var instanceof sn2.b)) {
            u.b();
            return;
        } else {
            sn2.b bVar = (sn2.b) sn2Var;
            fn1Var = new fn1(bVar.a, bVar.b, bVar.e, bVar.c, bVar.d, true);
        }
        f fVarE = this.b.E(am1.class.getName());
        hy8 hy8Var = this.a;
        if (fVarE != null) {
            hy8Var.a(new tn8(fn1Var));
            return;
        }
        if (!z) {
            hy8Var.c(fn1Var);
            return;
        }
        z59[] z59VarArr = {(sf4) this.c.invoke(), fn1Var};
        ArrayList arrayList = new ArrayList(2);
        for (int i = 0; i < 2; i++) {
            arrayList.add(new kd4(z59VarArr[i]));
        }
        Object[] array = arrayList.toArray(new kd4[0]);
        if (array == null) {
            ac4.c("null cannot be cast to non-null type kotlin.Array<T>");
        } else {
            kd4[] kd4VarArr = (kd4[]) array;
            hy8Var.a((lj1[]) Arrays.copyOf(kd4VarArr, kd4VarArr.length));
        }
    }
}

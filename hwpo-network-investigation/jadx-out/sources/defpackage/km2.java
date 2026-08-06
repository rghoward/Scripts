package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.workouts.presentation.day_workouts.DayViewModel$listenSessionsUpdates$2", f = "DayViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class km2 extends p6a implements ci4<gd8, r02<? super g2b>, Object> {
    public /* synthetic */ Object t;
    public final /* synthetic */ cm2 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public km2(cm2 cm2Var, r02<? super km2> r02Var) {
        super(2, r02Var);
        this.u = cm2Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        km2 km2Var = new km2(this.u, r02Var);
        km2Var.t = obj;
        return km2Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(gd8 gd8Var, r02<? super g2b> r02Var) {
        return ((km2) create(gd8Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        Set set;
        gd8 gd8Var = (gd8) this.t;
        dv8.b(obj);
        int i = cm2.I;
        int i2 = gd8Var.a;
        cm2 cm2Var = this.u;
        Set setI = cm2.i(i2, cm2Var.j());
        ArrayList arrayListJ = cm2Var.j();
        int i3 = 10;
        ArrayList arrayList = new ArrayList(ph1.n(arrayListJ, 10));
        int size = arrayListJ.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj2 = arrayListJ.get(i4);
            i4++;
            bc8 bc8VarA = (bc8) obj2;
            if (setI.contains(Integer.valueOf(bc8VarA.t))) {
                List<s23> list = bc8VarA.A;
                ArrayList arrayList2 = new ArrayList(ph1.n(list, i3));
                for (s23 s23VarD : list) {
                    int id = s23VarD.getId();
                    int i5 = gd8Var.a;
                    if (id == i5 && (s23VarD instanceof fd8)) {
                        fd8 fd8Var = (fd8) s23VarD;
                        String str = gd8Var.b;
                        o89 o89Var = gd8Var.c;
                        boolean z = gd8Var.f;
                        boolean z2 = gd8Var.g;
                        s23VarD = fd8.d(fd8Var, i5, str, o89Var, gd8Var.d, gd8Var.e, z, z2, 2);
                    }
                    arrayList2.add(s23VarD);
                    setI = setI;
                }
                set = setI;
                bc8VarA = bc8.a(bc8VarA, arrayList2, false, 3967);
            } else {
                set = setI;
            }
            arrayList.add(bc8VarA);
            setI = set;
            i3 = 10;
        }
        cm2Var.e(new cm2.b.c(arrayList));
        return g2b.a;
    }
}

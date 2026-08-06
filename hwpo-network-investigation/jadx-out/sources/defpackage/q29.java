package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q29 implements oh4 {
    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        obj.getClass();
        List list = (List) obj;
        Object obj2 = list.get(0);
        u29 u29Var = t29.s;
        Boolean bool = Boolean.FALSE;
        xj5.a(obj2, bool);
        jja jjaVar = null;
        vaa vaaVar = obj2 != null ? (vaa) u29Var.u.invoke(obj2) : null;
        vaaVar.getClass();
        int i = vaaVar.a;
        Object obj3 = list.get(1);
        u29 u29Var2 = t29.t;
        xj5.a(obj3, bool);
        jda jdaVar = obj3 != null ? (jda) u29Var2.u.invoke(obj3) : null;
        jdaVar.getClass();
        int i2 = jdaVar.a;
        Object obj4 = list.get(2);
        dka[] dkaVarArr = bka.b;
        u29 u29Var3 = t29.x;
        xj5.a(obj4, bool);
        bka bkaVar = obj4 != null ? (bka) u29Var3.u.invoke(obj4) : null;
        bkaVar.getClass();
        long j = bkaVar.a;
        Object obj5 = list.get(3);
        qha qhaVar = qha.c;
        qha qhaVar2 = (xj5.a(obj5, bool) || obj5 == null) ? null : (qha) ((oh4) t29.m.u).invoke(obj5);
        Object obj6 = list.get(4);
        h18 h18Var = h18.c;
        h18 h18Var2 = (xj5.a(obj6, bool) || obj6 == null) ? null : (h18) ((oh4) d39.a.u).invoke(obj6);
        Object obj7 = list.get(5);
        e86 e86Var = e86.d;
        e86 e86Var2 = (xj5.a(obj7, bool) || obj7 == null) ? null : (e86) ((oh4) t29.C.u).invoke(obj7);
        Object obj8 = list.get(6);
        c86 c86Var = (xj5.a(obj8, bool) || obj8 == null) ? null : (c86) ((oh4) d39.c.u).invoke(obj8);
        c86Var.getClass();
        int i3 = c86Var.a;
        Object obj9 = list.get(7);
        u29 u29Var4 = t29.u;
        xj5.a(obj9, bool);
        o55 o55Var = obj9 != null ? (o55) u29Var4.u.invoke(obj9) : null;
        o55Var.getClass();
        int i4 = o55Var.a;
        Object obj10 = list.get(8);
        boolean zA = xj5.a(obj10, bool);
        au3 au3Var = d39.d;
        if (!zA && obj10 != null) {
            jjaVar = (jja) ((oh4) au3Var.u).invoke(obj10);
        }
        return new ss7(i, i2, j, qhaVar2, h18Var2, e86Var2, i3, i4, jjaVar);
    }
}

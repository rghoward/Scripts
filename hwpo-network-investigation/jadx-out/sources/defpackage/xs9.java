package defpackage;

import com.hwpo_training_app.R;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class xs9 {
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void a(final ms9 ms9Var, final ox6 ox6Var, final ei4 ei4Var, jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(-977568115);
        int i2 = (i & 6) == 0 ? (bj4VarO.J(ms9Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= bj4VarO.J(ox6Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bj4VarO.j(ei4Var) ? 256 : 128;
        }
        if (bj4VarO.A(i2 & 1, (i2 & 147) != 146)) {
            String strB = ws3.b(bj4VarO, R.string.m3c_snackbar_pane_title);
            Object objF = bj4VarO.f();
            if (objF == jt1.a.a) {
                objF = new gt3();
                bj4VarO.C(objF);
            }
            gt3 gt3Var = (gt3) objF;
            Object obj = gt3Var.a;
            ArrayList arrayList = gt3Var.b;
            if (xj5.a(ms9Var, obj)) {
                bj4VarO.K(1443908949);
                bj4VarO.U(false);
            } else {
                bj4VarO.K(1154891761);
                gt3Var.a = ms9Var;
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    arrayList2.add((ms9) ((ft3) arrayList.get(i3)).a);
                }
                ArrayList arrayList3 = new ArrayList(arrayList2);
                if (!arrayList3.contains(ms9Var)) {
                    arrayList3.add(ms9Var);
                }
                arrayList.clear();
                ArrayList arrayList4 = new ArrayList(arrayList3.size());
                int size2 = arrayList3.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    Object obj2 = arrayList3.get(i4);
                    if (obj2 != null) {
                        arrayList4.add(obj2);
                    }
                }
                int size3 = arrayList4.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    ms9 ms9Var2 = (ms9) arrayList4.get(i5);
                    arrayList.add(new ft3(ms9Var2, gr1.b(-1952400805, new ss9(ms9Var2, ms9Var, gt3Var, strB), bj4VarO)));
                }
                bj4VarO.U(false);
            }
            fl6 fl6VarD = dv0.d(di.a.a, false);
            int iD = bj4VarO.D();
            kw7 kw7VarP = bj4VarO.P();
            ox6 ox6VarC = it1.c(bj4VarO, ox6Var);
            bt1.c.getClass();
            qr5.a aVar = bt1.a.b;
            if (bj4VarO.a == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, bt1.a.f, fl6VarD);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            bt1.a.b bVar = bt1.a.g;
            if (bj4VarO.S || !xj5.a(bj4VarO.f(), Integer.valueOf(iD))) {
                qh.a(iD, bj4VarO, iD, bVar);
            }
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            xj8 xj8VarA = bj4VarO.a();
            if (xj8VarA == null) {
                aa0.c("no recompose scope found");
                return;
            }
            bj4VarO.t(xj8VarA);
            gt3Var.c = xj8VarA;
            bj4VarO.K(-1888182177);
            int size4 = arrayList.size();
            for (int i6 = 0; i6 < size4; i6++) {
                ft3 ft3Var = (ft3) arrayList.get(i6);
                ms9 ms9Var3 = (ms9) ft3Var.a;
                fr1 fr1Var = ft3Var.b;
                bj4VarO.p(1325010085, ms9Var3);
                fr1Var.invoke(gr1.b(-1893791890, new ts9(ei4Var, ms9Var3), bj4VarO), bj4VarO, 6);
                bj4VarO.U(false);
            }
            bj4VarO.U(false);
            bj4VarO.U(true);
        } else {
            bj4VarO.u();
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: ps9
                @Override // defpackage.ci4
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int iS = gz3.s(i | 1);
                    xs9.a(ms9Var, ox6Var, ei4Var, (jt1) obj3, iS);
                    return g2b.a;
                }
            };
        }
    }

    public static final void b(final ys9 ys9Var, final ox6 ox6Var, final ei4 ei4Var, jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(-1077081618);
        int i2 = (bj4VarO.J(ys9Var) ? 4 : 2) | i | 48;
        if (bj4VarO.A(i2 & 1, (i2 & 147) != 146)) {
            ms9 ms9Var = (ms9) ys9Var.b.getValue();
            u3 u3Var = (u3) bj4VarO.F(qu1.a);
            boolean zJ = bj4VarO.J(ms9Var) | bj4VarO.j(u3Var);
            Object objF = bj4VarO.f();
            if (zJ || objF == jt1.a.a) {
                objF = new us9(ms9Var, u3Var, null);
                bj4VarO.C(objF);
            }
            wd3.d(bj4VarO, (ci4) objF, ms9Var);
            ms9 ms9Var2 = (ms9) ys9Var.b.getValue();
            ox6.a aVar = ox6.a.t;
            a(ms9Var2, aVar, ei4Var, bj4VarO, 432);
            ox6Var = aVar;
        } else {
            bj4VarO.u();
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4(ox6Var, ei4Var, i) { // from class: os9
                public final /* synthetic */ ox6 u;
                public final /* synthetic */ ei4 v;

                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iS = gz3.s(385);
                    xs9.b(this.t, this.u, this.v, (jt1) obj, iS);
                    return g2b.a;
                }
            };
        }
    }
}

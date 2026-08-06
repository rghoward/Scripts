package defpackage;

import android.text.Spanned;
import androidx.emoji2.text.d;
import androidx.emoji2.text.f;
import java.text.BreakIterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class rh0 implements jac {
    public static final /* synthetic */ rh0 t = new rh0();

    public static final void b(final boolean z, final mh4 mh4Var, jt1 jt1Var, final int i) {
        int i2;
        bj4 bj4VarO = jt1Var.o(-361453782);
        if ((i & 6) == 0) {
            i2 = (bj4VarO.c(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bj4VarO.j(mh4Var) ? 32 : 16;
        }
        if (bj4VarO.A(i2 & 1, (i2 & 19) != 18)) {
            Object objA = mc6.a(bj4VarO);
            if (objA == null) {
                bj4VarO.K(535274673);
                objA = oc6.a(bj4VarO);
            } else {
                bj4VarO.K(535271790);
            }
            bj4VarO.U(false);
            if (objA == null) {
                aa0.c("No NavigationEventDispatcherOwner was provided via LocalNavigationEventDispatcherOwner and no OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner. Please provide one of the two.");
                return;
            }
            boolean zJ = bj4VarO.J(objA);
            Object objF = bj4VarO.f();
            jt1.a.C0187a c0187a = jt1.a.a;
            if (zJ || objF == c0187a) {
                f87 f87Var = objA instanceof f87 ? (f87) objA : null;
                e87 navigationEventDispatcher = f87Var != null ? f87Var.getNavigationEventDispatcher() : null;
                bh7 bh7Var = objA instanceof bh7 ? (bh7) objA : null;
                objF = new ih0(navigationEventDispatcher, bh7Var != null ? bh7Var.getOnBackPressedDispatcher() : null);
                bj4VarO.C(objF);
            }
            ih0 ih0Var = (ih0) objF;
            long j = bj4VarO.T;
            boolean zJ2 = bj4VarO.J(ih0Var) | bj4VarO.i(j);
            Object objF2 = bj4VarO.f();
            Object obj = objF2;
            if (zJ2 || objF2 == c0187a) {
                fs1 fs1Var = new fs1(new jh0(j, objA));
                fs1Var.c = new es1();
                bj4VarO.C(fs1Var);
                obj = fs1Var;
            }
            final fs1 fs1Var2 = (fs1) obj;
            bj4VarO.K(-585307852);
            boolean zJ3 = bj4VarO.j(fs1Var2) | ((i2 & 112) == 32);
            Object objF3 = bj4VarO.f();
            if (zJ3 || objF3 == c0187a) {
                objF3 = new kh0(fs1Var2, mh4Var);
                bj4VarO.C(objF3);
            }
            c33 c33Var = wd3.a;
            bj4VarO.w((mh4) objF3);
            Boolean boolValueOf = Boolean.valueOf(z);
            int i3 = i2 & 14;
            boolean zJ4 = bj4VarO.j(fs1Var2) | (i3 == 4);
            Object objF4 = bj4VarO.f();
            if (zJ4 || objF4 == c0187a) {
                objF4 = new oh4() { // from class: lh0
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj2) {
                        fs1 fs1Var3 = fs1Var2;
                        hh0.b bVar = fs1Var3.a;
                        boolean z2 = z;
                        bVar.setEnabled(z2);
                        fs1Var3.b.f(z2);
                        return new oh0((u76) obj2, fs1Var3);
                    }
                };
                bj4VarO.C(objF4);
            }
            f76.a(boolValueOf, fs1Var2, null, (oh4) objF4, bj4VarO, i3);
            boolean zJ5 = bj4VarO.j(ih0Var) | bj4VarO.j(fs1Var2);
            Object objF5 = bj4VarO.f();
            if (zJ5 || objF5 == c0187a) {
                objF5 = new mh0(ih0Var, fs1Var2);
                bj4VarO.C(objF5);
            }
            wd3.b(ih0Var, fs1Var2, (oh4) objF5, bj4VarO);
            bj4VarO.U(false);
        } else {
            bj4VarO.u();
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: nh0
                @Override // defpackage.ci4
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iS = gz3.s(i | 1);
                    rh0.b(z, mh4Var, (jt1) obj2, iS);
                    return g2b.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0046  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.text.BreakIterator] */
    /* JADX WARN: Type inference failed for: r4v2, types: [androidx.emoji2.text.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
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
    public static final int c(int i, String str) {
        ?? r5;
        ?? r6;
        int spanEnd;
        d dVarE = e();
        Integer num = null;
        if (dVarE != null) {
            if (!(dVarE.c() == 1)) {
                aa0.c("Not initialized yet");
                return 0;
            }
            b78.d(str, "charSequence cannot be null");
            ?? r4 = dVarE.e.b;
            r4.getClass();
            if (i < 0 || i >= str.length()) {
                r6 = str;
                spanEnd = -1;
            } else if (str instanceof Spanned) {
                Spanned spanned = (Spanned) str;
                ve3[] ve3VarArr = (ve3[]) spanned.getSpans(i, i + 1, ve3.class);
                if (ve3VarArr.length > 0) {
                    spanEnd = spanned.getSpanEnd(ve3VarArr[0]);
                    r6 = str;
                } else {
                    ?? r7 = str;
                    spanEnd = ((f.c) r4.c(r7, Math.max(0, i - 16), Math.min(str.length(), i + 16), Integer.MAX_VALUE, true, new f.c(i))).c;
                    r6 = r7;
                }
            } else {
                ?? r8 = str;
                spanEnd = ((f.c) r4.c(r8, Math.max(0, i - 16), Math.min(str.length(), i + 16), Integer.MAX_VALUE, true, new f.c(i))).c;
                r6 = r8;
            }
            Integer numValueOf = Integer.valueOf(spanEnd);
            r5 = r6;
            if (spanEnd != -1) {
                num = numValueOf;
            }
        } else {
            r5 = str;
        }
        if (num != null) {
            r5 = r6;
            return num.intValue();
        }
        r5 = r6;
        ?? characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(r5);
        return characterInstance.following(i);
    }

    public static final int d(int i, String str) {
        d dVarE = e();
        Integer num = null;
        if (dVarE != null) {
            Integer numValueOf = Integer.valueOf(dVarE.b(str, Math.max(0, i - 1)));
            if (numValueOf.intValue() != -1) {
                num = numValueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i);
    }

    public static final d e() {
        if (!d.d()) {
            return null;
        }
        d dVarA = d.a();
        if (dVarA.c() == 1) {
            return dVarA;
        }
        return null;
    }

    @Override // defpackage.jac
    public Object a() {
        List list = wfc.a;
        return Boolean.valueOf(((u5c) t5c.u.t.t).b());
    }
}

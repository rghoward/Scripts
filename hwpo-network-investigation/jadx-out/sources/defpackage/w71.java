package defpackage;

import com.hwpo_training_app.R;
import com.intercom.twig.BuildConfig;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class w71 extends dl0<y71, n61> {
    public static final /* synthetic */ int O = 0;
    public final ad8 A;
    public final uc8 B;
    public final mz9 C;
    public final r31 D;
    public final r60 E;
    public final k55 F;
    public final bu8 G;
    public final cm3 H;
    public final int I;
    public final yq6 J;
    public final yq6 K;
    public final yq6 L;
    public final yq6 M;
    public final yq6 N;
    public final pta x;
    public final qk4 y;
    public final e70 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w71(q09 q09Var, pta ptaVar, qk4 qk4Var, e70 e70Var, ad8 ad8Var, uc8 uc8Var, af7 af7Var, mz9 mz9Var, r31 r31Var, ih9 ih9Var, r60 r60Var, dh9 dh9Var, mf7 mf7Var, k55 k55Var, bu8 bu8Var, cm3 cm3Var) {
        super(y71.f);
        q09Var.getClass();
        ptaVar.getClass();
        qk4Var.getClass();
        e70Var.getClass();
        ad8Var.getClass();
        uc8Var.getClass();
        af7Var.getClass();
        mz9Var.getClass();
        r31Var.getClass();
        ih9Var.getClass();
        r60Var.getClass();
        dh9Var.getClass();
        mf7Var.getClass();
        k55Var.getClass();
        bu8Var.getClass();
        cm3Var.getClass();
        y71.Companion.getClass();
        this.x = ptaVar;
        this.y = qk4Var;
        this.z = e70Var;
        this.A = ad8Var;
        this.B = uc8Var;
        this.C = mz9Var;
        this.D = r31Var;
        this.E = r60Var;
        this.F = k55Var;
        this.G = bu8Var;
        this.H = cm3Var;
        Integer num = (Integer) q09Var.a("com.fitr_training.tracking.presentation.entry_details.challenge.ChallengeEntryDetailsFragment.ID");
        if (num == null) {
            z90.a("ID must not be null");
            throw null;
        }
        this.I = num.intValue();
        String str = (String) q09Var.a("com.fitr_training.tracking.presentation.entry_details.challenge.ChallengeEntryDetailsFragment.TITLE");
        if (str == null) {
            z90.a("TITLE must not be null");
            throw null;
        }
        String str2 = (String) q09Var.a("com.fitr_training.tracking.presentation.entry_details.challenge.ChallengeEntryDetailsFragment.DATE");
        if (str2 == null) {
            z90.a("DATE must not be null");
            throw null;
        }
        this.J = oh7.a(this.u, new e71(0));
        this.K = oh7.a(this.u, new f71(0));
        this.L = oh7.a(this.u, new g71());
        this.M = oh7.a(this.u, new xl0(1));
        this.N = oh7.a(this.u, new h71(0));
        e(new n61.a(str, str2));
        yk2.o(new k74(ih9Var.b, new l71(this, null)), rhb.b(this));
        yk2.o(new k74(dh9Var.b, new k71(this, null)), rhb.b(this));
        g2b g2bVar = g2b.a;
        yk2.o(new k74(new o71(mf7Var.b(g2bVar)), new p71(this, null)), rhb.b(this));
        oy0.d(rhb.b(this), null, null, new m71(this, null), 3);
        yk2.o(new k74(af7Var.b(g2bVar), new n71(this, null)), rhb.b(this));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.util.ArrayList] */
    public static final Object g(w71 w71Var, m61 m61Var, r02 r02Var) throws Throwable {
        v71 v71Var;
        ?? arrayList;
        String str;
        w71Var.getClass();
        if (r02Var instanceof v71) {
            v71Var = (v71) r02Var;
            int i = v71Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                v71Var.v = i - Integer.MIN_VALUE;
            } else {
                v71Var = new v71(w71Var, r02Var);
            }
        } else {
            v71Var = new v71(w71Var, r02Var);
        }
        Object obj = v71Var.t;
        int i2 = v71Var.v;
        if (i2 == 0) {
            dv8.b(obj);
            e70 e70Var = w71Var.z;
            ad8 ad8Var = w71Var.A;
            uc8 uc8Var = w71Var.B;
            v71Var.v = 1;
            vc8 vc8Var = m61Var.d;
            bd8 bd8Var = m61Var.e;
            u60 u60Var = u60.w;
            List list = hf3.t;
            if (vc8Var != null) {
                List<m89> list2 = vc8Var.c;
                arrayList = new ArrayList();
                for (Object obj2 : list2) {
                    if (((m89) obj2).j != u60Var) {
                        arrayList.add(obj2);
                    }
                }
            } else {
                arrayList = list;
            }
            if (vc8Var != null) {
                List<m89> list3 = vc8Var.c;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : list3) {
                    if (((m89) obj3).j == u60Var) {
                        arrayList2.add(obj3);
                    }
                }
                list = arrayList2;
            }
            zc8 zc8VarA = ad8Var.a(bd8Var);
            int i3 = m61Var.b;
            int i4 = m61Var.a;
            String str2 = m61Var.c;
            boolean zB = cy.b(zc8VarA);
            boolean zB2 = cy.b(zc8VarA);
            String str3 = vc8Var != null ? vc8Var.b : null;
            boolean z = !(str3 == null || str3.length() == 0);
            boolean z2 = !arrayList.isEmpty();
            boolean z3 = !list.isEmpty();
            boolean z4 = zc8VarA.B;
            if (vc8Var == null || (str = vc8Var.b) == null) {
                str = BuildConfig.FLAVOR;
            }
            String str4 = str;
            List<String> list4 = bd8Var.h;
            zc8 zc8VarA2 = ad8Var.a(bd8Var);
            tc8 tc8VarA = vc8Var != null ? uc8Var.a(vc8Var) : new tc8(0, 15, (String) null, (ArrayList) null);
            e70Var.getClass();
            d71 d71Var = new d71(i3, i4, str2, zB, zB2, z, z2, z3, z4, str4, list4, zc8VarA2, tc8VarA, e70.b(arrayList), e70.b(list));
            v72 v72Var = v72.t;
            if (d71Var == v72Var) {
                return v72Var;
            }
            obj = d71Var;
        } else {
            if (i2 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
        }
        w71Var.e(new n61.b((d71) obj));
        return g2b.a;
    }

    @Override // defpackage.dl0
    public final el0 d(bl0 bl0Var) {
        bl0Var.getClass();
        if (bl0Var instanceof n61.a) {
            n61.a aVar = (n61.a) bl0Var;
            return y71.a(b(), aVar.a, aVar.b, false, null, null, 28);
        }
        if (bl0Var instanceof n61.b) {
            return y71.a(b(), null, null, false, ((n61.b) bl0Var).a, null, 23);
        }
        if (bl0Var instanceof n61.c) {
            y71 y71VarB = b();
            bu8 bu8Var = this.G;
            return y71.a(y71VarB, null, null, false, null, new vz7(0, true, true, bu8Var.b(R.string.something_went_wrong, new Object[0]), bu8Var.b(R.string.no_internet_description, new Object[0]), bu8Var.b(R.string.reload, new Object[0]), 65), 15);
        }
        if (bl0Var instanceof n61.d) {
            return y71.a(b(), null, null, true, null, null, 27);
        }
        return bl0Var instanceof n61.e ? y71.a(b(), null, null, false, null, null, 27) : b();
    }
}

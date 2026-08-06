package defpackage;

import com.hwpo_training_app.leaderboards.common.domain.entity.LeaderboardPerformanceModel;
import com.hwpo_training_app.leaderboards.common.presentation.entity.LeaderboardScoreResultUiEntityMapperKt;
import com.hwpo_training_app.leaderboards.valuedetails.domain.entity.LeaderboardValueDetailsModel;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h25 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;

    public /* synthetic */ h25(int i, Object obj, Object obj2) {
        this.t = i;
        this.u = obj;
        this.v = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        ria riaVar;
        vp vpVarI;
        qia qiaVar;
        int i = this.t;
        Object obj2 = this.v;
        Object obj3 = this.u;
        switch (i) {
            case 0:
                e25 e25Var = (e25) obj3;
                a87.e eVar = (a87.e) obj2;
                LeaderboardValueDetailsModel leaderboardValueDetailsModel = (LeaderboardValueDetailsModel) obj;
                e25.b.a aVar = e25.b.a.a;
                int i2 = e25.T;
                e25Var.e(aVar);
                om1 om1Var = e25Var.B;
                int i3 = eVar.a;
                int i4 = eVar.b;
                String strB = LeaderboardScoreResultUiEntityMapperKt.b(leaderboardValueDetailsModel.p, e25Var.O);
                LeaderboardPerformanceModel leaderboardPerformanceModel = leaderboardValueDetailsModel.r;
                om1Var.a(i3, i4, leaderboardValueDetailsModel.d, strB, leaderboardPerformanceModel != null ? leaderboardPerformanceModel.b : null);
                break;
            default:
                dja djaVar = (dja) obj3;
                iw.c cVar = (iw.c) obj2;
                ro4 ro4Var = (ro4) obj;
                iw iwVar = djaVar.b;
                dt7 dt7Var = djaVar.a;
                ria riaVar2 = (ria) dt7Var.getValue();
                if (xj5.a(iwVar, (riaVar2 == null || (qiaVar = riaVar2.a) == null) ? null : qiaVar.a) && (riaVar = (ria) dt7Var.getValue()) != null) {
                    l07 l07Var = riaVar.b;
                    iw.c cVarC = dja.c(cVar, riaVar);
                    if (cVarC == null) {
                        vpVarI = null;
                    } else {
                        int i5 = cVarC.c;
                        int i6 = cVarC.b;
                        vpVarI = riaVar.i(i6, i5);
                        sk8 sk8VarB = riaVar.b(i6);
                        int i7 = i5 - 1;
                        vpVarI.s(((((long) Float.floatToRawIntBits(l07Var.d(i6) == l07Var.d(i7) ? Math.min(riaVar.b(i7).a, sk8VarB.a) : 0.0f)) << 32) | (((long) Float.floatToRawIntBits(sk8VarB.b)) & 4294967295L)) ^ (-9223372034707292160L));
                    }
                } else {
                    vpVarI = null;
                }
                eja ejaVar = vpVarI != null ? new eja(vpVarI) : null;
                if (ejaVar != null) {
                    ro4Var.R0(ejaVar);
                    ro4Var.s(true);
                }
                break;
        }
        return g2b.a;
    }
}

package com.hwpo_training_app.leaderboards.details.list.presentation;

import com.hwpo_training_app.R;
import com.hwpo_training_app.leaderboards.details.list.presentation.entity.AthleteResultUiEntity;
import defpackage.bu8;
import defpackage.ci4;
import defpackage.g2b;
import defpackage.oh4;
import defpackage.p6a;
import defpackage.pi4;
import defpackage.r02;
import defpackage.t72;
import defpackage.u;
import defpackage.wa;
import defpackage.xm2;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.leaderboards.details.list.presentation.AthletesListViewModel$onEyeClicked$1", f = "AthletesListViewModel.kt", l = {173, 174}, m = "invokeSuspend", v = 2)
final class AthletesListViewModel$onEyeClicked$1 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ AthleteResultUiEntity.OtherAthleteResultUiEntity u;
    public final /* synthetic */ AthletesListViewModel v;

    /* JADX INFO: renamed from: com.hwpo_training_app.leaderboards.details.list.presentation.AthletesListViewModel$onEyeClicked$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class AnonymousClass1 extends wa implements ci4<Boolean, r02<? super g2b>, Object> {
        @Override // defpackage.ci4
        public final Object invoke(Boolean bool, r02<? super g2b> r02Var) {
            String strB;
            boolean zBooleanValue = bool.booleanValue();
            AthletesListViewModel athletesListViewModel = (AthletesListViewModel) this.receiver;
            bu8 bu8Var = athletesListViewModel.C;
            if (zBooleanValue) {
                strB = bu8Var.b(R.string.score_was_hidden, new Object[0]);
            } else {
                if (zBooleanValue) {
                    u.b();
                    return null;
                }
                strB = bu8Var.b(R.string.score_was_restored, new Object[0]);
            }
            athletesListViewModel.f(new AthletesListEvents.ShowMessage(strB));
            return g2b.a;
        }
    }

    /* JADX INFO: renamed from: com.hwpo_training_app.leaderboards.details.list.presentation.AthletesListViewModel$onEyeClicked$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class AnonymousClass2 extends pi4 implements oh4<Exception, g2b> {
        @Override // defpackage.oh4
        public final g2b invoke(Exception exc) {
            Exception exc2 = exc;
            exc2.getClass();
            AthletesListViewModel.g((AthletesListViewModel) this.receiver, exc2);
            return g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AthletesListViewModel$onEyeClicked$1(AthleteResultUiEntity.OtherAthleteResultUiEntity otherAthleteResultUiEntity, AthletesListViewModel athletesListViewModel, r02<? super AthletesListViewModel$onEyeClicked$1> r02Var) {
        super(2, r02Var);
        this.u = otherAthleteResultUiEntity;
        this.v = athletesListViewModel;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new AthletesListViewModel$onEyeClicked$1(this.u, this.v, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((AthletesListViewModel$onEyeClicked$1) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
    
        if (r13 == r4) goto L15;
     */
    @Override // defpackage.ak0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
        /*
            r12 = this;
            int r0 = r12.t
            com.hwpo_training_app.leaderboards.details.list.presentation.AthletesListViewModel r3 = r12.v
            r1 = 2
            r2 = 1
            v72 r4 = defpackage.v72.t
            if (r0 == 0) goto L1d
            if (r0 == r2) goto L19
            if (r0 != r1) goto L12
            defpackage.dv8.b(r13)
            goto L53
        L12:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r12)
            r12 = 0
            return r12
        L19:
            defpackage.dv8.b(r13)
            goto L39
        L1d:
            defpackage.dv8.b(r13)
            com.hwpo_training_app.leaderboards.details.list.domain.ChangeTopValueVisibilityUseCase$Params r13 = new com.hwpo_training_app.leaderboards.details.list.domain.ChangeTopValueVisibilityUseCase$Params
            com.hwpo_training_app.leaderboards.details.list.presentation.entity.AthleteResultUiEntity$OtherAthleteResultUiEntity r0 = r12.u
            int r5 = r0.a
            boolean r0 = r0.l
            r13.<init>(r5, r0)
            com.hwpo_training_app.leaderboards.details.list.domain.ChangeTopValueVisibilityUseCase r0 = r3.B
            r12.t = r2
            r0.getClass()
            java.lang.Object r13 = defpackage.g5b.b(r0, r13, r12)
            if (r13 != r4) goto L39
            goto L52
        L39:
            xd3 r13 = (defpackage.xd3) r13
            com.hwpo_training_app.leaderboards.details.list.presentation.AthletesListViewModel$onEyeClicked$1$1 r5 = new com.hwpo_training_app.leaderboards.details.list.presentation.AthletesListViewModel$onEyeClicked$1$1
            java.lang.String r10 = "onChangeTopValueVisibilitySuccess(Z)V"
            r11 = 4
            r6 = 2
            com.hwpo_training_app.leaderboards.details.list.presentation.AthletesListViewModel r7 = r12.v
            java.lang.Class<com.hwpo_training_app.leaderboards.details.list.presentation.AthletesListViewModel> r8 = com.hwpo_training_app.leaderboards.details.list.presentation.AthletesListViewModel.class
            java.lang.String r9 = "onChangeTopValueVisibilitySuccess"
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r12.t = r1
            java.lang.Object r13 = defpackage.yd3.b(r13, r5, r12)
            if (r13 != r4) goto L53
        L52:
            return r4
        L53:
            xd3 r13 = (defpackage.xd3) r13
            com.hwpo_training_app.leaderboards.details.list.presentation.AthletesListViewModel$onEyeClicked$1$2 r1 = new com.hwpo_training_app.leaderboards.details.list.presentation.AthletesListViewModel$onEyeClicked$1$2
            java.lang.String r6 = "onError(Ljava/lang/Exception;)V"
            r7 = 0
            r2 = 1
            java.lang.Class<com.hwpo_training_app.leaderboards.details.list.presentation.AthletesListViewModel> r4 = com.hwpo_training_app.leaderboards.details.list.presentation.AthletesListViewModel.class
            java.lang.String r5 = "onError"
            r1.<init>(r2, r3, r4, r5, r6, r7)
            defpackage.yd3.c(r13, r1)
            g2b r12 = defpackage.g2b.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hwpo_training_app.leaderboards.details.list.presentation.AthletesListViewModel$onEyeClicked$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

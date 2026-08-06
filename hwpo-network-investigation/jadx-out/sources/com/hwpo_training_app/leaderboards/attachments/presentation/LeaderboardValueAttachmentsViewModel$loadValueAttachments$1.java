package com.hwpo_training_app.leaderboards.attachments.presentation;

import com.hwpo_training_app.leaderboards.common.domain.entity.LeaderboardPerformanceModel;
import com.hwpo_training_app.leaderboards.common.domain.entity.LeaderboardUserModel;
import com.hwpo_training_app.leaderboards.valuedetails.domain.GetLeaderboardValueDetailsUseCase;
import com.hwpo_training_app.leaderboards.valuedetails.domain.entity.LeaderboardValueDetailsModel;
import com.intercom.twig.BuildConfig;
import defpackage.a3a;
import defpackage.aa0;
import defpackage.ci4;
import defpackage.dv8;
import defpackage.g2b;
import defpackage.g5b;
import defpackage.hf3;
import defpackage.kn1;
import defpackage.m89;
import defpackage.oh4;
import defpackage.p6a;
import defpackage.ph1;
import defpackage.pi4;
import defpackage.r02;
import defpackage.rma;
import defpackage.sk1;
import defpackage.t72;
import defpackage.v72;
import defpackage.ws0;
import defpackage.xd3;
import defpackage.xm2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.leaderboards.attachments.presentation.LeaderboardValueAttachmentsViewModel$loadValueAttachments$1", f = "LeaderboardValueAttachmentsViewModel.kt", l = {134}, m = "invokeSuspend", v = 2)
final class LeaderboardValueAttachmentsViewModel$loadValueAttachments$1 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ LeaderboardValueAttachmentsViewModel u;

    /* JADX INFO: renamed from: com.hwpo_training_app.leaderboards.attachments.presentation.LeaderboardValueAttachmentsViewModel$loadValueAttachments$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class AnonymousClass1 extends pi4 implements oh4<LeaderboardValueDetailsModel, g2b> {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v4, types: [hf3] */
        /* JADX WARN: Type inference failed for: r0v5 */
        /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r11v0, types: [java.util.List] */
        @Override // defpackage.oh4
        public final g2b invoke(LeaderboardValueDetailsModel leaderboardValueDetailsModel) {
            ?? arrayList;
            LeaderboardValueDetailsModel leaderboardValueDetailsModel2 = leaderboardValueDetailsModel;
            leaderboardValueDetailsModel2.getClass();
            LeaderboardValueAttachmentsViewModel leaderboardValueAttachmentsViewModel = (LeaderboardValueAttachmentsViewModel) this.receiver;
            int i = LeaderboardValueAttachmentsViewModel.J;
            leaderboardValueAttachmentsViewModel.getClass();
            leaderboardValueAttachmentsViewModel.e(LeaderboardValueAttachmentsViewModel.Action.LoadingFinished.a);
            long j = leaderboardValueDetailsModel2.a;
            LeaderboardPerformanceModel leaderboardPerformanceModel = leaderboardValueDetailsModel2.r;
            String str = leaderboardPerformanceModel != null ? leaderboardPerformanceModel.b : null;
            if (str == null) {
                str = BuildConfig.FLAVOR;
            }
            String str2 = str;
            LeaderboardUserModel leaderboardUserModel = leaderboardValueDetailsModel2.m;
            boolean z = leaderboardUserModel.f;
            String str3 = leaderboardUserModel.b;
            String str4 = leaderboardUserModel.d;
            String strValueOf = String.valueOf(a3a.S(str3));
            if (leaderboardPerformanceModel != null) {
                List<m89> list = leaderboardPerformanceModel.c;
                arrayList = new ArrayList(ph1.n(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(kn1.a((m89) it.next()));
                }
            } else {
                arrayList = hf3.t;
            }
            leaderboardValueAttachmentsViewModel.e(new LeaderboardValueAttachmentsViewModel.Action.AttachmentsLoaded(ws0.h(new sk1.a(j, true, z, BuildConfig.FLAVOR, str3, str4, strValueOf, str2, arrayList))));
            return g2b.a;
        }
    }

    /* JADX INFO: renamed from: com.hwpo_training_app.leaderboards.attachments.presentation.LeaderboardValueAttachmentsViewModel$loadValueAttachments$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class AnonymousClass2 extends pi4 implements oh4<Exception, g2b> {
        @Override // defpackage.oh4
        public final g2b invoke(Exception exc) {
            Exception exc2 = exc;
            exc2.getClass();
            LeaderboardValueAttachmentsViewModel leaderboardValueAttachmentsViewModel = (LeaderboardValueAttachmentsViewModel) this.receiver;
            int i = LeaderboardValueAttachmentsViewModel.J;
            leaderboardValueAttachmentsViewModel.getClass();
            rma.a.b(exc2);
            leaderboardValueAttachmentsViewModel.e(LeaderboardValueAttachmentsViewModel.Action.LoadingError.a);
            leaderboardValueAttachmentsViewModel.f(new LeaderboardValueAttachmentsEvents.ShowError(leaderboardValueAttachmentsViewModel.E.a(exc2)));
            return g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeaderboardValueAttachmentsViewModel$loadValueAttachments$1(LeaderboardValueAttachmentsViewModel leaderboardValueAttachmentsViewModel, r02<? super LeaderboardValueAttachmentsViewModel$loadValueAttachments$1> r02Var) {
        super(2, r02Var);
        this.u = leaderboardValueAttachmentsViewModel;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new LeaderboardValueAttachmentsViewModel$loadValueAttachments$1(this.u, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((LeaderboardValueAttachmentsViewModel$loadValueAttachments$1) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        LeaderboardValueAttachmentsViewModel leaderboardValueAttachmentsViewModel = this.u;
        if (i == 0) {
            dv8.b(obj);
            LeaderboardValueAttachmentsViewModel.Action.LoadingStarted loadingStarted = LeaderboardValueAttachmentsViewModel.Action.LoadingStarted.a;
            int i2 = LeaderboardValueAttachmentsViewModel.J;
            leaderboardValueAttachmentsViewModel.e(loadingStarted);
            GetLeaderboardValueDetailsUseCase getLeaderboardValueDetailsUseCase = leaderboardValueAttachmentsViewModel.A;
            Integer num = new Integer(leaderboardValueAttachmentsViewModel.F);
            this.t = 1;
            getLeaderboardValueDetailsUseCase.getClass();
            obj = g5b.b(getLeaderboardValueDetailsUseCase, num, this);
            v72 v72Var = v72.t;
            if (obj == v72Var) {
                return v72Var;
            }
        } else {
            if (i != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
        }
        ((xd3) obj).a(new AnonymousClass1(1, leaderboardValueAttachmentsViewModel, LeaderboardValueAttachmentsViewModel.class, "onLeaderboardValueLoaded", "onLeaderboardValueLoaded(Lcom/hwpo_training_app/leaderboards/valuedetails/domain/entity/LeaderboardValueDetailsModel;)V", 0), new AnonymousClass2(1, leaderboardValueAttachmentsViewModel, LeaderboardValueAttachmentsViewModel.class, "onError", "onError(Ljava/lang/Exception;)V", 0));
        return g2b.a;
    }
}

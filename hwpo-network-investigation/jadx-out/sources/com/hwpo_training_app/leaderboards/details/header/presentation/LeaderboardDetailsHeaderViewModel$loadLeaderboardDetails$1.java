package com.hwpo_training_app.leaderboards.details.header.presentation;

import android.icu.text.SimpleDateFormat;
import android.text.Html;
import com.hwpo_training_app.R;
import com.hwpo_training_app.leaderboards.common.domain.entity.LeaderboardModel;
import com.hwpo_training_app.leaderboards.common.domain.entity.LeaderboardSectionModel;
import com.hwpo_training_app.leaderboards.common.domain.entity.LeaderboardType;
import com.hwpo_training_app.leaderboards.details.header.domain.GetLeaderboardByIdUseCase;
import com.hwpo_training_app.leaderboards.details.header.presentation.entity.HeaderUiEntity;
import com.intercom.twig.BuildConfig;
import defpackage.aa0;
import defpackage.bu8;
import defpackage.ci4;
import defpackage.dv8;
import defpackage.g2b;
import defpackage.g5b;
import defpackage.oh4;
import defpackage.p6a;
import defpackage.pi4;
import defpackage.r02;
import defpackage.rhb;
import defpackage.rma;
import defpackage.t72;
import defpackage.u;
import defpackage.v72;
import defpackage.xd3;
import defpackage.xm2;
import defpackage.yk2;
import defpackage.z2a;
import j$.time.LocalDateTime;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.leaderboards.details.header.presentation.LeaderboardDetailsHeaderViewModel$loadLeaderboardDetails$1", f = "LeaderboardDetailsHeaderViewModel.kt", l = {233}, m = "invokeSuspend", v = 2)
final class LeaderboardDetailsHeaderViewModel$loadLeaderboardDetails$1 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ LeaderboardDetailsHeaderViewModel u;

    /* JADX INFO: renamed from: com.hwpo_training_app.leaderboards.details.header.presentation.LeaderboardDetailsHeaderViewModel$loadLeaderboardDetails$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class AnonymousClass1 extends pi4 implements oh4<LeaderboardModel, g2b> {
        @Override // defpackage.oh4
        public final g2b invoke(LeaderboardModel leaderboardModel) {
            String str;
            String strB;
            String str2;
            CharSequence charSequenceFromHtml;
            LeaderboardModel leaderboardModel2 = leaderboardModel;
            leaderboardModel2.getClass();
            LeaderboardDetailsHeaderViewModel leaderboardDetailsHeaderViewModel = (LeaderboardDetailsHeaderViewModel) this.receiver;
            leaderboardDetailsHeaderViewModel.I = leaderboardModel2;
            LeaderboardType leaderboardType = leaderboardModel2.d;
            LeaderboardSectionModel leaderboardSectionModel = leaderboardModel2.j;
            int iOrdinal = leaderboardType.ordinal();
            CharSequence charSequence = null;
            charSequence = null;
            if (iOrdinal == 0) {
                str = leaderboardSectionModel != null ? leaderboardSectionModel.b : null;
            } else {
                if (iOrdinal != 1) {
                    u.b();
                    return null;
                }
                str = leaderboardModel2.b;
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy", Locale.getDefault());
            LocalDateTime localDateTime = leaderboardModel2.q;
            if (localDateTime != null) {
                String str3 = simpleDateFormat.format(Long.valueOf(yk2.w(localDateTime)));
                bu8 bu8Var = leaderboardDetailsHeaderViewModel.G;
                str3.getClass();
                strB = bu8Var.b(R.string.last_updated, str3);
            } else {
                strB = null;
            }
            String str4 = strB == null ? BuildConfig.FLAVOR : strB;
            if (leaderboardType != LeaderboardType.t) {
                charSequence = leaderboardModel2.c;
            } else if (leaderboardSectionModel != null && (str2 = leaderboardSectionModel.c) != null) {
                if (z2a.o(str2, "<body>", false)) {
                    String strC = rhb.c(str2);
                    if (strC == null) {
                        charSequenceFromHtml = str2;
                        strC = BuildConfig.FLAVOR;
                    }
                    charSequenceFromHtml = str2;
                    charSequenceFromHtml = Html.fromHtml(strC, 63);
                }
                charSequenceFromHtml = str2;
                charSequence = charSequenceFromHtml;
            }
            CharSequence charSequence2 = charSequence;
            boolean z = leaderboardType == LeaderboardType.u;
            leaderboardDetailsHeaderViewModel.e(new LeaderboardDetailsHeaderViewModel.Action.HeaderLoaded(new HeaderUiEntity(str == null ? BuildConfig.FLAVOR : str, str4, charSequence2, !(charSequence2 == null || charSequence2.length() == 0) || z, (charSequence2 == null || charSequence2.length() == 0) && z, z)));
            leaderboardDetailsHeaderViewModel.g();
            return g2b.a;
        }
    }

    /* JADX INFO: renamed from: com.hwpo_training_app.leaderboards.details.header.presentation.LeaderboardDetailsHeaderViewModel$loadLeaderboardDetails$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class AnonymousClass2 extends pi4 implements oh4<Exception, g2b> {
        @Override // defpackage.oh4
        public final g2b invoke(Exception exc) {
            Exception exc2 = exc;
            exc2.getClass();
            LeaderboardDetailsHeaderViewModel leaderboardDetailsHeaderViewModel = (LeaderboardDetailsHeaderViewModel) this.receiver;
            leaderboardDetailsHeaderViewModel.f(new LeaderboardDetailsHeaderEvents.ShowError(leaderboardDetailsHeaderViewModel.H.a(exc2)));
            leaderboardDetailsHeaderViewModel.e(LeaderboardDetailsHeaderViewModel.Action.FinishLoading.a);
            rma.a.b(exc2);
            return g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeaderboardDetailsHeaderViewModel$loadLeaderboardDetails$1(LeaderboardDetailsHeaderViewModel leaderboardDetailsHeaderViewModel, r02<? super LeaderboardDetailsHeaderViewModel$loadLeaderboardDetails$1> r02Var) {
        super(2, r02Var);
        this.u = leaderboardDetailsHeaderViewModel;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new LeaderboardDetailsHeaderViewModel$loadLeaderboardDetails$1(this.u, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((LeaderboardDetailsHeaderViewModel$loadLeaderboardDetails$1) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        LeaderboardDetailsHeaderViewModel leaderboardDetailsHeaderViewModel = this.u;
        if (i == 0) {
            dv8.b(obj);
            GetLeaderboardByIdUseCase getLeaderboardByIdUseCase = leaderboardDetailsHeaderViewModel.A;
            Integer num = new Integer(leaderboardDetailsHeaderViewModel.i());
            this.t = 1;
            getLeaderboardByIdUseCase.getClass();
            obj = g5b.b(getLeaderboardByIdUseCase, num, this);
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
        ((xd3) obj).a(new AnonymousClass1(1, leaderboardDetailsHeaderViewModel, LeaderboardDetailsHeaderViewModel.class, "onLeaderboardLoaded", "onLeaderboardLoaded(Lcom/hwpo_training_app/leaderboards/common/domain/entity/LeaderboardModel;)V", 0), new AnonymousClass2(1, leaderboardDetailsHeaderViewModel, LeaderboardDetailsHeaderViewModel.class, "onError", "onError(Ljava/lang/Exception;)V", 0));
        return g2b.a;
    }
}

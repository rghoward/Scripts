package com.hwpo_training_app.leaderboards.details.list.presentation;

import com.hwpo_training_app.R;
import com.hwpo_training_app.leaderboards.common.domain.entity.LeaderboardScoreResultModel;
import com.hwpo_training_app.leaderboards.common.domain.entity.LeaderboardScoreSubValueModel;
import com.hwpo_training_app.leaderboards.common.domain.entity.LeaderboardTopValueModel;
import com.hwpo_training_app.leaderboards.common.domain.entity.LeaderboardUserModel;
import com.hwpo_training_app.leaderboards.common.presentation.entity.LeaderboardScoreResultUiEntityMapperKt;
import com.hwpo_training_app.leaderboards.common.presentation.entity.SimpleAthleteResultUiEntityMapperKt;
import com.hwpo_training_app.leaderboards.details.list.presentation.entity.AthleteResultPositionUiEntity;
import com.hwpo_training_app.leaderboards.details.list.presentation.entity.AthleteResultUiEntity;
import com.hwpo_training_app.leaderboards.details.list.presentation.entity.AthleteResultUiEntityMapperKt;
import defpackage.a3a;
import defpackage.bl0;
import defpackage.bu8;
import defpackage.ci4;
import defpackage.dv8;
import defpackage.g2b;
import defpackage.oh4;
import defpackage.p6a;
import defpackage.ph1;
import defpackage.pi4;
import defpackage.r02;
import defpackage.th1;
import defpackage.u;
import defpackage.xd3;
import defpackage.xm2;
import defpackage.yd3;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.leaderboards.details.list.presentation.AthletesListViewModel$observeTopValues$1", f = "AthletesListViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
final class AthletesListViewModel$observeTopValues$1 extends p6a implements ci4<xd3<? extends Exception, ? extends List<? extends LeaderboardTopValueModel>>, r02<? super g2b>, Object> {
    public /* synthetic */ Object t;
    public final /* synthetic */ AthletesListViewModel u;

    /* JADX INFO: renamed from: com.hwpo_training_app.leaderboards.details.list.presentation.AthletesListViewModel$observeTopValues$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class AnonymousClass1 extends pi4 implements oh4<List<? extends LeaderboardTopValueModel>, g2b> {
        @Override // defpackage.oh4
        public final g2b invoke(List<? extends LeaderboardTopValueModel> list) {
            bl0 athletesListLoaded;
            int i;
            int iA;
            Object otherAthleteResultUiEntity;
            Object obj;
            Object obj2;
            List<? extends LeaderboardTopValueModel> list2 = list;
            list2.getClass();
            AthletesListViewModel athletesListViewModel = (AthletesListViewModel) this.receiver;
            AthletesListViewModel.Companion companion = AthletesListViewModel.Companion;
            athletesListViewModel.getClass();
            LeaderboardTopValueModel leaderboardTopValueModel = (LeaderboardTopValueModel) th1.A(list2);
            Integer numValueOf = leaderboardTopValueModel != null ? Integer.valueOf(leaderboardTopValueModel.a) : null;
            if (numValueOf != null && numValueOf.intValue() == -1) {
                athletesListLoaded = AthletesListViewModel.Action.ShowAddYourScorePlaceHolder.a;
            } else if (numValueOf != null && numValueOf.intValue() == -2) {
                athletesListLoaded = AthletesListViewModel.Action.ShowNoResultsPlaceHolder.a;
            } else {
                ArrayList arrayList = new ArrayList(ph1.n(list2, 10));
                for (LeaderboardTopValueModel leaderboardTopValueModel2 : list2) {
                    bu8 bu8Var = athletesListViewModel.C;
                    leaderboardTopValueModel2.getClass();
                    List<LeaderboardScoreSubValueModel> list3 = leaderboardTopValueModel2.j;
                    Integer num = leaderboardTopValueModel2.b;
                    LeaderboardScoreResultModel leaderboardScoreResultModel = leaderboardTopValueModel2.q;
                    bu8Var.getClass();
                    LeaderboardUserModel leaderboardUserModel = leaderboardTopValueModel2.n;
                    boolean z = leaderboardUserModel.f;
                    int i2 = leaderboardUserModel.e;
                    String str = leaderboardUserModel.c;
                    String str2 = leaderboardUserModel.b;
                    String str3 = "?";
                    if (z && leaderboardScoreResultModel == null) {
                        int i3 = leaderboardTopValueModel2.a;
                        String str4 = leaderboardUserModel.d;
                        String strValueOf = String.valueOf(a3a.S(str2));
                        if (num == null) {
                            obj2 = num;
                            obj2 = "?";
                        }
                        obj2 = num;
                        otherAthleteResultUiEntity = new AthleteResultUiEntity.MyEmptyResultUiEntity(i3, str4, strValueOf, String.valueOf(obj2), bu8Var.b(R.string.my_athlete_name, str2), bu8Var.b(R.string.athlete_country_years, str, Integer.valueOf(i2)));
                    } else if (!z || leaderboardScoreResultModel == null) {
                        int i4 = leaderboardTopValueModel2.a;
                        String str5 = leaderboardUserModel.d;
                        String strValueOf2 = String.valueOf(a3a.S(str2));
                        Object obj3 = str3;
                        if (num != null) {
                            obj3 = num;
                        }
                        String strValueOf3 = String.valueOf(obj3);
                        String str6 = leaderboardUserModel.b;
                        String strB = bu8Var.b(R.string.athlete_country_years, str, Integer.valueOf(i2));
                        AthleteResultPositionUiEntity.Companion.getClass();
                        int i5 = AthleteResultPositionUiEntity.Companion.a(num, false).t;
                        String strB2 = leaderboardScoreResultModel != null ? LeaderboardScoreResultUiEntityMapperKt.b(leaderboardScoreResultModel, bu8Var) : null;
                        boolean z2 = !list3.isEmpty();
                        ArrayList arrayListA = SimpleAthleteResultUiEntityMapperKt.a(list3, bu8Var);
                        boolean z3 = leaderboardTopValueModel2.o;
                        boolean z4 = leaderboardTopValueModel2.c;
                        int i6 = leaderboardTopValueModel2.e;
                        int iA2 = AthleteResultUiEntityMapperKt.a(leaderboardTopValueModel2, bu8Var);
                        int i7 = leaderboardTopValueModel2.d;
                        int iB = AthleteResultUiEntityMapperKt.b(leaderboardTopValueModel2, bu8Var);
                        String strC = AthleteResultUiEntityMapperKt.c(leaderboardTopValueModel2, bu8Var);
                        int iD = AthleteResultUiEntityMapperKt.d(leaderboardTopValueModel2, bu8Var);
                        boolean z5 = leaderboardTopValueModel2.c;
                        if (z5) {
                            i = R.drawable.ic_eye_open;
                        } else {
                            if (z5) {
                                u.b();
                                return null;
                            }
                            i = R.drawable.ic_eye_close;
                        }
                        int i8 = i;
                        if (z5) {
                            iA = bu8Var.a(R.color.eye_open);
                        } else {
                            if (z5) {
                                u.b();
                                return null;
                            }
                            iA = bu8Var.a(R.color.eye_close);
                        }
                        otherAthleteResultUiEntity = new AthleteResultUiEntity.OtherAthleteResultUiEntity(i4, str5, strValueOf2, strValueOf3, str6, strB, i5, strB2, z2, arrayListA, z3, z4, i6, iA2, i7, iB, strC, iD, i8, iA);
                    } else {
                        int i9 = leaderboardTopValueModel2.a;
                        String str7 = leaderboardUserModel.d;
                        String strValueOf4 = String.valueOf(a3a.S(str2));
                        if (num != null) {
                            obj = str3;
                            obj = num;
                        }
                        obj = str3;
                        String strValueOf5 = String.valueOf(obj);
                        String strB3 = bu8Var.b(R.string.my_athlete_name, str2);
                        String strB4 = bu8Var.b(R.string.athlete_country_years, str, Integer.valueOf(i2));
                        AthleteResultPositionUiEntity.Companion.getClass();
                        otherAthleteResultUiEntity = new AthleteResultUiEntity.MyFilledResultUiEntity(i9, str7, strValueOf4, strValueOf5, strB3, strB4, AthleteResultPositionUiEntity.Companion.a(num, z).t, AthleteResultPositionUiEntity.Companion.a(num, z).u, LeaderboardScoreResultUiEntityMapperKt.b(leaderboardScoreResultModel, bu8Var), !list3.isEmpty(), SimpleAthleteResultUiEntityMapperKt.a(list3, bu8Var), leaderboardTopValueModel2.o, leaderboardTopValueModel2.e, AthleteResultUiEntityMapperKt.a(leaderboardTopValueModel2, bu8Var), leaderboardTopValueModel2.d, AthleteResultUiEntityMapperKt.b(leaderboardTopValueModel2, bu8Var), AthleteResultUiEntityMapperKt.c(leaderboardTopValueModel2, bu8Var), AthleteResultUiEntityMapperKt.d(leaderboardTopValueModel2, bu8Var));
                    }
                    arrayList.add(otherAthleteResultUiEntity);
                }
                athletesListLoaded = new AthletesListViewModel.Action.AthletesListLoaded(arrayList);
            }
            athletesListViewModel.e(athletesListLoaded);
            return g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AthletesListViewModel$observeTopValues$1(AthletesListViewModel athletesListViewModel, r02<? super AthletesListViewModel$observeTopValues$1> r02Var) {
        super(2, r02Var);
        this.u = athletesListViewModel;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        AthletesListViewModel$observeTopValues$1 athletesListViewModel$observeTopValues$1 = new AthletesListViewModel$observeTopValues$1(this.u, r02Var);
        athletesListViewModel$observeTopValues$1.t = obj;
        return athletesListViewModel$observeTopValues$1;
    }

    @Override // defpackage.ci4
    public final Object invoke(xd3<? extends Exception, ? extends List<? extends LeaderboardTopValueModel>> xd3Var, r02<? super g2b> r02Var) {
        return ((AthletesListViewModel$observeTopValues$1) create(xd3Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        xd3 xd3Var = (xd3) this.t;
        dv8.b(obj);
        yd3.h(xd3Var, new AnonymousClass1(1, this.u, AthletesListViewModel.class, "onTopValuesLoaded", "onTopValuesLoaded(Ljava/util/List;)V", 0));
        return g2b.a;
    }
}

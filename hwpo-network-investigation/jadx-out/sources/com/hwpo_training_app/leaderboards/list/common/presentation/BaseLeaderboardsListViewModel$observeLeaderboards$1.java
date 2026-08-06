package com.hwpo_training_app.leaderboards.list.common.presentation;

import android.icu.text.SimpleDateFormat;
import com.hwpo_training_app.R;
import com.hwpo_training_app.leaderboards.common.domain.entity.LeaderboardModel;
import com.hwpo_training_app.leaderboards.common.domain.entity.LeaderboardPlanModel;
import com.hwpo_training_app.leaderboards.common.domain.entity.LeaderboardScheduleModel;
import com.hwpo_training_app.leaderboards.common.domain.entity.LeaderboardScoreResultModel;
import com.hwpo_training_app.leaderboards.common.domain.entity.LeaderboardScoreSubValueModel;
import com.hwpo_training_app.leaderboards.common.domain.entity.LeaderboardSectionModel;
import com.hwpo_training_app.leaderboards.common.domain.entity.LeaderboardTopValueModel;
import com.hwpo_training_app.leaderboards.common.domain.entity.LeaderboardType;
import com.hwpo_training_app.leaderboards.common.domain.entity.LeaderboardUserModel;
import com.hwpo_training_app.leaderboards.common.presentation.entity.LeaderboardScoreResultUiEntityMapperKt;
import com.hwpo_training_app.leaderboards.common.presentation.entity.SimpleAthleteResultUiEntityMapperKt;
import com.hwpo_training_app.leaderboards.list.common.presentation.entity.LeaderboardItemUiEntity;
import com.hwpo_training_app.leaderboards.list.common.presentation.entity.TopValuePositionUiEntity;
import com.hwpo_training_app.leaderboards.list.common.presentation.entity.TopValueUiEntity;
import com.intercom.twig.BuildConfig;
import defpackage.a3a;
import defpackage.bl0;
import defpackage.bu8;
import defpackage.ci4;
import defpackage.dv8;
import defpackage.g2b;
import defpackage.js7;
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
import defpackage.yk2;
import j$.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.leaderboards.list.common.presentation.BaseLeaderboardsListViewModel$observeLeaderboards$1", f = "BaseLeaderboardsListViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
final class BaseLeaderboardsListViewModel$observeLeaderboards$1 extends p6a implements ci4<xd3<? extends Exception, ? extends List<? extends LeaderboardModel>>, r02<? super g2b>, Object> {
    public /* synthetic */ Object t;
    public final /* synthetic */ BaseLeaderboardsListViewModel u;

    /* JADX INFO: renamed from: com.hwpo_training_app.leaderboards.list.common.presentation.BaseLeaderboardsListViewModel$observeLeaderboards$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class AnonymousClass1 extends pi4 implements oh4<List<? extends LeaderboardModel>, g2b> {
        /* JADX WARN: Code duplicated, block: B:82:0x0198  */
        /* JADX WARN: Code duplicated, block: B:85:0x01b3  */
        /* JADX WARN: Code duplicated, block: B:86:0x01ba  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.oh4
        public final g2b invoke(List<? extends LeaderboardModel> list) {
            bl0 leaderboardsLoaded;
            js7 js7Var;
            js7 js7Var2;
            String strB;
            LeaderboardItemUiEntity leaderboardProgramUiEntity;
            int i;
            TopValuePositionUiEntity topValuePositionUiEntity;
            LeaderboardScoreResultModel leaderboardScoreResultModel;
            String strB2;
            List<? extends LeaderboardModel> list2 = list;
            list2.getClass();
            BaseLeaderboardsListViewModel baseLeaderboardsListViewModel = (BaseLeaderboardsListViewModel) this.receiver;
            BaseLeaderboardsListViewModel.Companion companion = BaseLeaderboardsListViewModel.Companion;
            baseLeaderboardsListViewModel.getClass();
            LeaderboardModel leaderboardModel = (LeaderboardModel) th1.A(list2);
            if (leaderboardModel == null || leaderboardModel.a != -1) {
                int i2 = 10;
                ArrayList arrayList = new ArrayList(ph1.n(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    LeaderboardModel leaderboardModel2 = (LeaderboardModel) it.next();
                    bu8 bu8Var = baseLeaderboardsListViewModel.B;
                    leaderboardModel2.getClass();
                    String str = leaderboardModel2.b;
                    LeaderboardSectionModel leaderboardSectionModel = leaderboardModel2.j;
                    bu8Var.getClass();
                    LeaderboardType leaderboardType = leaderboardModel2.d;
                    int iOrdinal = leaderboardType.ordinal();
                    if (iOrdinal == 0) {
                        LeaderboardPlanModel leaderboardPlanModel = leaderboardModel2.i;
                        js7Var = new js7(leaderboardPlanModel != null ? leaderboardPlanModel.b : null, leaderboardSectionModel != null ? leaderboardSectionModel.b : null);
                    } else {
                        if (iOrdinal != 1) {
                            u.b();
                            return null;
                        }
                        js7Var = new js7(str, null);
                    }
                    String str2 = (String) js7Var.t;
                    String str3 = (String) js7Var.u;
                    int iOrdinal2 = leaderboardType.ordinal();
                    if (iOrdinal2 == 0) {
                        js7Var2 = new js7(leaderboardSectionModel != null ? leaderboardSectionModel.b : null, leaderboardSectionModel != null ? leaderboardSectionModel.c : null);
                    } else {
                        if (iOrdinal2 != 1) {
                            u.b();
                            return null;
                        }
                        js7Var2 = new js7(str, leaderboardModel2.c);
                    }
                    String str4 = (String) js7Var2.t;
                    String str5 = (String) js7Var2.u;
                    LocalDateTime localDateTime = leaderboardModel2.q;
                    if (localDateTime != null) {
                        String str6 = new SimpleDateFormat("dd.MM.yyyy", Locale.getDefault()).format(Long.valueOf(yk2.w(localDateTime)));
                        str6.getClass();
                        strB = bu8Var.b(R.string.last_updated, str6);
                    } else {
                        strB = null;
                    }
                    int i3 = leaderboardModel2.l;
                    Integer numValueOf = Integer.valueOf(i3);
                    if (i3 <= 0) {
                        numValueOf = null;
                    }
                    String strB3 = numValueOf != null ? bu8Var.b(R.string.leaderboard_comments_count, Integer.valueOf(numValueOf.intValue())) : null;
                    List<LeaderboardTopValueModel> list3 = leaderboardModel2.r;
                    ArrayList arrayList2 = new ArrayList(ph1.n(list3, i2));
                    for (LeaderboardTopValueModel leaderboardTopValueModel : list3) {
                        leaderboardTopValueModel.getClass();
                        List<LeaderboardScoreSubValueModel> list4 = leaderboardTopValueModel.j;
                        Integer num = leaderboardTopValueModel.b;
                        LeaderboardUserModel leaderboardUserModel = leaderboardTopValueModel.n;
                        boolean z = leaderboardUserModel.f;
                        String str7 = leaderboardUserModel.b;
                        String strB4 = z ? bu8Var.b(R.string.my_athlete_name, str7) : str7;
                        int i4 = leaderboardTopValueModel.a;
                        String str8 = leaderboardUserModel.d;
                        String strValueOf = String.valueOf(a3a.S(str7));
                        String strValueOf2 = String.valueOf(num == null ? "?" : num);
                        TopValuePositionUiEntity.Companion.getClass();
                        if (num == null) {
                            i = i4;
                        } else {
                            i = i4;
                            if (num.intValue() == 1) {
                                topValuePositionUiEntity = TopValuePositionUiEntity.FIRST;
                            }
                            int i5 = topValuePositionUiEntity.t;
                            String strB5 = bu8Var.b(R.string.athlete_country_years, leaderboardUserModel.c, Integer.valueOf(leaderboardUserModel.e));
                            leaderboardScoreResultModel = leaderboardTopValueModel.q;
                            if (leaderboardScoreResultModel != null) {
                                strB2 = LeaderboardScoreResultUiEntityMapperKt.b(leaderboardScoreResultModel, bu8Var);
                            } else {
                                strB2 = null;
                            }
                            arrayList2.add(new TopValueUiEntity(i, strB4, str8, strValueOf, strValueOf2, i5, strB5, strB2, leaderboardUserModel.f, !list4.isEmpty(), SimpleAthleteResultUiEntityMapperKt.a(list4, bu8Var)));
                            str4 = str4;
                            it = it;
                        }
                        if (num != null && num.intValue() == 2) {
                            topValuePositionUiEntity = TopValuePositionUiEntity.SECOND;
                        } else if (num != null && num.intValue() == 3) {
                            topValuePositionUiEntity = TopValuePositionUiEntity.THIRD;
                        } else if (!z) {
                            topValuePositionUiEntity = TopValuePositionUiEntity.OTHER;
                        } else if ((num != null ? num.intValue() : Integer.MAX_VALUE) > 3) {
                            topValuePositionUiEntity = TopValuePositionUiEntity.MY_OTHER;
                        } else {
                            topValuePositionUiEntity = TopValuePositionUiEntity.OTHER;
                        }
                        int i6 = topValuePositionUiEntity.t;
                        String strB6 = bu8Var.b(R.string.athlete_country_years, leaderboardUserModel.c, Integer.valueOf(leaderboardUserModel.e));
                        leaderboardScoreResultModel = leaderboardTopValueModel.q;
                        if (leaderboardScoreResultModel != null) {
                            strB2 = LeaderboardScoreResultUiEntityMapperKt.b(leaderboardScoreResultModel, bu8Var);
                        } else {
                            strB2 = null;
                        }
                        arrayList2.add(new TopValueUiEntity(i, strB4, str8, strValueOf, strValueOf2, i6, strB6, strB2, leaderboardUserModel.f, !list4.isEmpty(), SimpleAthleteResultUiEntityMapperKt.a(list4, bu8Var)));
                        str4 = str4;
                        it = it;
                    }
                    Iterator it2 = it;
                    String str9 = str4;
                    boolean z2 = leaderboardModel2.s;
                    int i7 = leaderboardModel2.a;
                    if (z2) {
                        leaderboardProgramUiEntity = new LeaderboardItemUiEntity.LeaderboardProgramsSearchResultUiEntity(i7, str2 == null ? BuildConfig.FLAVOR : str2, str3, str9 == null ? BuildConfig.FLAVOR : str9, str5, arrayList2, strB);
                    } else {
                        String str10 = str2 == null ? BuildConfig.FLAVOR : str2;
                        String str11 = str9 == null ? BuildConfig.FLAVOR : str9;
                        LeaderboardScheduleModel leaderboardScheduleModel = leaderboardModel2.m;
                        leaderboardProgramUiEntity = new LeaderboardItemUiEntity.LeaderboardProgramUiEntity(i7, str10, str3, str11, str5, strB, strB3, arrayList2, leaderboardScheduleModel != null ? Integer.valueOf(leaderboardScheduleModel.a) : null, leaderboardSectionModel != null ? Integer.valueOf(leaderboardSectionModel.a) : null);
                    }
                    arrayList.add(leaderboardProgramUiEntity);
                    it = it2;
                    i2 = 10;
                }
                leaderboardsLoaded = new BaseLeaderboardsListViewModel.Action.LeaderboardsLoaded(arrayList);
            } else {
                leaderboardsLoaded = BaseLeaderboardsListViewModel.Action.ShowEmptyResultsPlaceHolder.a;
            }
            baseLeaderboardsListViewModel.e(leaderboardsLoaded);
            return g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseLeaderboardsListViewModel$observeLeaderboards$1(BaseLeaderboardsListViewModel baseLeaderboardsListViewModel, r02<? super BaseLeaderboardsListViewModel$observeLeaderboards$1> r02Var) {
        super(2, r02Var);
        this.u = baseLeaderboardsListViewModel;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        BaseLeaderboardsListViewModel$observeLeaderboards$1 baseLeaderboardsListViewModel$observeLeaderboards$1 = new BaseLeaderboardsListViewModel$observeLeaderboards$1(this.u, r02Var);
        baseLeaderboardsListViewModel$observeLeaderboards$1.t = obj;
        return baseLeaderboardsListViewModel$observeLeaderboards$1;
    }

    @Override // defpackage.ci4
    public final Object invoke(xd3<? extends Exception, ? extends List<? extends LeaderboardModel>> xd3Var, r02<? super g2b> r02Var) {
        return ((BaseLeaderboardsListViewModel$observeLeaderboards$1) create(xd3Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        xd3 xd3Var = (xd3) this.t;
        dv8.b(obj);
        yd3.h(xd3Var, new AnonymousClass1(1, this.u, BaseLeaderboardsListViewModel.class, "onLeaderboardsLoaded", "onLeaderboardsLoaded(Ljava/util/List;)V", 0));
        return g2b.a;
    }
}

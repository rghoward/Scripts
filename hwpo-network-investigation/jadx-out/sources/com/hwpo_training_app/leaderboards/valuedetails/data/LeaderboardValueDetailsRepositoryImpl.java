package com.hwpo_training_app.leaderboards.valuedetails.data;

import com.hwpo_training_app.core.data.model.attachments.SectionAttachmentNetworkEntity;
import com.hwpo_training_app.leaderboards.common.data.network.response.LeaderboardMeasureNetworkEntity;
import com.hwpo_training_app.leaderboards.common.data.network.response.LeaderboardPerformanceNetworkEntity;
import com.hwpo_training_app.leaderboards.common.data.network.response.LeaderboardPlanNetworkEntity;
import com.hwpo_training_app.leaderboards.common.data.network.response.LeaderboardResultTypeNetworkEntity;
import com.hwpo_training_app.leaderboards.common.data.network.response.LeaderboardScoreSubValueNetworkEntity;
import com.hwpo_training_app.leaderboards.common.data.network.response.LeaderboardSectionNetworkEntity;
import com.hwpo_training_app.leaderboards.common.data.network.response.LeaderboardUserNetworkEntity;
import com.hwpo_training_app.leaderboards.common.domain.entity.DomainEntitiesMapperKt;
import com.hwpo_training_app.leaderboards.common.domain.entity.LeaderboardPerformanceModel;
import com.hwpo_training_app.leaderboards.common.domain.entity.LeaderboardPlanModel;
import com.hwpo_training_app.leaderboards.common.domain.entity.LeaderboardScoreResultModel;
import com.hwpo_training_app.leaderboards.common.domain.entity.LeaderboardSectionModel;
import com.hwpo_training_app.leaderboards.common.domain.entity.LeaderboardUserModel;
import com.hwpo_training_app.leaderboards.common.domain.entity.TimeCapModel;
import com.hwpo_training_app.leaderboards.common.domain.entity.TopValueKind;
import com.hwpo_training_app.leaderboards.valuedetails.data.network.api.LeaderboardValueDetailsApi;
import com.hwpo_training_app.leaderboards.valuedetails.data.network.response.LeaderboardValueDetailsNetworkEntity;
import com.hwpo_training_app.leaderboards.valuedetails.data.network.response.LeaderboardValueDetailsResponse;
import com.hwpo_training_app.leaderboards.valuedetails.data.network.response.LeaderboardValueParentInfoNetworkEntity;
import com.hwpo_training_app.leaderboards.valuedetails.domain.LeaderboardValueDetailsRepository;
import com.hwpo_training_app.leaderboards.valuedetails.domain.entity.LeaderboardValueDetailsModel;
import com.hwpo_training_app.leaderboards.valuedetails.domain.entity.LeaderboardValueParentInfoModel;
import defpackage.aa0;
import defpackage.dv8;
import defpackage.hf3;
import defpackage.ph1;
import defpackage.u;
import defpackage.u02;
import defpackage.v72;
import defpackage.wk6;
import defpackage.yk2;
import defpackage.z90;
import j$.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class LeaderboardValueDetailsRepositoryImpl implements LeaderboardValueDetailsRepository {
    public final LeaderboardValueDetailsApi a;

    public LeaderboardValueDetailsRepositoryImpl(LeaderboardValueDetailsApi leaderboardValueDetailsApi) {
        leaderboardValueDetailsApi.getClass();
        this.a = leaderboardValueDetailsApi;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:84:0x0195  */
    /* JADX WARN: Code duplicated, block: B:85:0x019a  */
    /* JADX WARN: Code duplicated, block: B:88:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:89:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:92:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:94:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:97:0x01e3 A[LOOP:1: B:95:0x01dd->B:97:0x01e3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:98:0x01f1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.ArrayList] */
    public final Object a(int i, u02 u02Var) throws Throwable {
        LeaderboardValueDetailsRepositoryImpl$getLeaderboardValueDetails$1 leaderboardValueDetailsRepositoryImpl$getLeaderboardValueDetails$1;
        ArrayList arrayList;
        boolean z;
        LeaderboardScoreResultModel roundReps;
        LeaderboardScoreResultModel other;
        LeaderboardPlanNetworkEntity leaderboardPlanNetworkEntity;
        LeaderboardPlanModel leaderboardPlanModelC;
        LeaderboardSectionNetworkEntity leaderboardSectionNetworkEntity;
        LeaderboardSectionModel leaderboardSectionModel;
        LeaderboardPerformanceNetworkEntity leaderboardPerformanceNetworkEntity;
        LeaderboardPerformanceModel leaderboardPerformanceModel;
        List<SectionAttachmentNetworkEntity> list;
        ?? arrayList2;
        Iterator it;
        TimeCapModel time;
        if (u02Var instanceof LeaderboardValueDetailsRepositoryImpl$getLeaderboardValueDetails$1) {
            leaderboardValueDetailsRepositoryImpl$getLeaderboardValueDetails$1 = (LeaderboardValueDetailsRepositoryImpl$getLeaderboardValueDetails$1) u02Var;
            int i2 = leaderboardValueDetailsRepositoryImpl$getLeaderboardValueDetails$1.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                leaderboardValueDetailsRepositoryImpl$getLeaderboardValueDetails$1.v = i2 - Integer.MIN_VALUE;
            } else {
                leaderboardValueDetailsRepositoryImpl$getLeaderboardValueDetails$1 = new LeaderboardValueDetailsRepositoryImpl$getLeaderboardValueDetails$1(this, u02Var);
            }
        } else {
            leaderboardValueDetailsRepositoryImpl$getLeaderboardValueDetails$1 = new LeaderboardValueDetailsRepositoryImpl$getLeaderboardValueDetails$1(this, u02Var);
        }
        Object objA = leaderboardValueDetailsRepositoryImpl$getLeaderboardValueDetails$1.t;
        int i3 = leaderboardValueDetailsRepositoryImpl$getLeaderboardValueDetails$1.v;
        if (i3 == 0) {
            dv8.b(objA);
            leaderboardValueDetailsRepositoryImpl$getLeaderboardValueDetails$1.v = 1;
            objA = this.a.a(i, leaderboardValueDetailsRepositoryImpl$getLeaderboardValueDetails$1);
            v72 v72Var = v72.t;
            if (objA == v72Var) {
                return v72Var;
            }
        } else {
            if (i3 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(objA);
        }
        LeaderboardValueDetailsResponse leaderboardValueDetailsResponse = (LeaderboardValueDetailsResponse) objA;
        leaderboardValueDetailsResponse.getClass();
        LeaderboardValueDetailsNetworkEntity leaderboardValueDetailsNetworkEntity = leaderboardValueDetailsResponse.a;
        int i4 = leaderboardValueDetailsNetworkEntity.a;
        LeaderboardMeasureNetworkEntity leaderboardMeasureNetworkEntity = leaderboardValueDetailsNetworkEntity.o;
        LeaderboardResultTypeNetworkEntity leaderboardResultTypeNetworkEntity = leaderboardValueDetailsNetworkEntity.q;
        boolean z2 = leaderboardValueDetailsNetworkEntity.b;
        Integer num = leaderboardValueDetailsNetworkEntity.c;
        int iIntValue = num != null ? num.intValue() : 0;
        Integer num2 = leaderboardValueDetailsNetworkEntity.d;
        int iIntValue2 = num2 != null ? num2.intValue() : 0;
        Integer num3 = leaderboardValueDetailsNetworkEntity.e;
        int iIntValue3 = num3 != null ? num3.intValue() : 0;
        boolean z3 = leaderboardValueDetailsNetworkEntity.h;
        boolean z4 = leaderboardValueDetailsNetworkEntity.i;
        TopValueKind topValueKind = leaderboardValueDetailsNetworkEntity.j ? TopValueKind.u : TopValueKind.t;
        List<LeaderboardScoreSubValueNetworkEntity> list2 = leaderboardValueDetailsNetworkEntity.l;
        if (list2 != null) {
            arrayList = new ArrayList(ph1.n(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList.add(DomainEntitiesMapperKt.d((LeaderboardScoreSubValueNetworkEntity) it2.next(), leaderboardResultTypeNetworkEntity));
            }
        } else {
            arrayList = null;
        }
        hf3 hf3Var = hf3.t;
        List list3 = arrayList == null ? hf3Var : arrayList;
        String str = leaderboardValueDetailsNetworkEntity.m;
        String str2 = leaderboardValueDetailsNetworkEntity.n;
        String strName = leaderboardMeasureNetworkEntity.name();
        LeaderboardUserNetworkEntity leaderboardUserNetworkEntity = leaderboardValueDetailsNetworkEntity.p;
        leaderboardUserNetworkEntity.getClass();
        LeaderboardUserModel leaderboardUserModel = new LeaderboardUserModel(leaderboardUserNetworkEntity.a, leaderboardUserNetworkEntity.e, leaderboardUserNetworkEntity.b, leaderboardUserNetworkEntity.c, leaderboardUserNetworkEntity.d, leaderboardUserNetworkEntity.f);
        boolean z5 = leaderboardValueDetailsNetworkEntity.r;
        boolean z6 = leaderboardValueDetailsNetworkEntity.s;
        Integer num4 = leaderboardValueDetailsNetworkEntity.f;
        Integer num5 = leaderboardValueDetailsNetworkEntity.g;
        Float f = leaderboardValueDetailsNetworkEntity.k;
        int iOrdinal = leaderboardResultTypeNetworkEntity.ordinal();
        if (iOrdinal != 0) {
            z = z6;
            if (iOrdinal == 1) {
                if (num4 == null || num5 == null) {
                    iIntValue = iIntValue;
                    time = new TimeCapModel.Time(f != null ? wk6.b(f.floatValue()) : 0);
                } else {
                    time = new TimeCapModel.RoundReps(num4.intValue(), num5.intValue(), f != null ? wk6.b(f.floatValue()) : 0);
                }
                roundReps = new LeaderboardScoreResultModel.TimeCap(time);
            } else {
                if (iOrdinal != 2) {
                    u.b();
                    return null;
                }
                str2 = str2;
                hf3Var = hf3Var;
                other = new LeaderboardScoreResultModel.Other(f != null ? f.floatValue() : 0.0f, leaderboardValueDetailsNetworkEntity.n, DomainEntitiesMapperKt.a(leaderboardMeasureNetworkEntity));
                iIntValue = iIntValue;
            }
            LeaderboardValueParentInfoNetworkEntity leaderboardValueParentInfoNetworkEntity = leaderboardValueDetailsNetworkEntity.t;
            int i5 = leaderboardValueParentInfoNetworkEntity.a;
            leaderboardPlanNetworkEntity = leaderboardValueParentInfoNetworkEntity.b;
            if (leaderboardPlanNetworkEntity != null) {
                leaderboardPlanModelC = DomainEntitiesMapperKt.c(leaderboardPlanNetworkEntity);
            } else {
                leaderboardPlanModelC = null;
            }
            leaderboardSectionNetworkEntity = leaderboardValueParentInfoNetworkEntity.c;
            if (leaderboardSectionNetworkEntity != null) {
                leaderboardSectionModel = new LeaderboardSectionModel(leaderboardSectionNetworkEntity.a, leaderboardSectionNetworkEntity.b, leaderboardSectionNetworkEntity.c);
            } else {
                leaderboardSectionModel = null;
            }
            LocalDateTime localDateTimeQ = yk2.q(leaderboardValueParentInfoNetworkEntity.d);
            localDateTimeQ.getClass();
            LeaderboardValueParentInfoModel leaderboardValueParentInfoModel = new LeaderboardValueParentInfoModel(i5, leaderboardPlanModelC, leaderboardSectionModel, localDateTimeQ);
            leaderboardPerformanceNetworkEntity = leaderboardValueDetailsResponse.b;
            if (leaderboardPerformanceNetworkEntity != null) {
                int i6 = leaderboardPerformanceNetworkEntity.a;
                String str3 = leaderboardPerformanceNetworkEntity.b;
                list = leaderboardPerformanceNetworkEntity.c;
                if (list != null) {
                    arrayList2 = new ArrayList(ph1.n(list, 10));
                    it = list.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((SectionAttachmentNetworkEntity) it.next()).a());
                    }
                } else {
                    arrayList2 = hf3Var;
                }
                leaderboardPerformanceModel = new LeaderboardPerformanceModel(i6, str3, arrayList2);
            } else {
                leaderboardPerformanceModel = null;
            }
            return new LeaderboardValueDetailsModel(i4, z2, iIntValue, iIntValue2, iIntValue3, z3, z4, topValueKind, list3, str, str2, strName, leaderboardUserModel, z5, z, other, leaderboardValueParentInfoModel, leaderboardPerformanceModel);
        }
        z = z6;
        iIntValue = iIntValue;
        int iB = f != null ? wk6.b(f.floatValue()) : 0;
        if (num4 == null) {
            z90.a("Required value was null.");
            return null;
        }
        int iIntValue4 = num4.intValue();
        if (num5 == null) {
            z90.a("Required value was null.");
            return null;
        }
        roundReps = new LeaderboardScoreResultModel.RoundReps(iB, iIntValue4, num5.intValue());
        other = roundReps;
        LeaderboardValueParentInfoNetworkEntity leaderboardValueParentInfoNetworkEntity2 = leaderboardValueDetailsNetworkEntity.t;
        int i7 = leaderboardValueParentInfoNetworkEntity2.a;
        leaderboardPlanNetworkEntity = leaderboardValueParentInfoNetworkEntity2.b;
        if (leaderboardPlanNetworkEntity != null) {
            leaderboardPlanModelC = DomainEntitiesMapperKt.c(leaderboardPlanNetworkEntity);
        } else {
            leaderboardPlanModelC = null;
        }
        leaderboardSectionNetworkEntity = leaderboardValueParentInfoNetworkEntity2.c;
        if (leaderboardSectionNetworkEntity != null) {
            leaderboardSectionModel = new LeaderboardSectionModel(leaderboardSectionNetworkEntity.a, leaderboardSectionNetworkEntity.b, leaderboardSectionNetworkEntity.c);
        } else {
            leaderboardSectionModel = null;
        }
        LocalDateTime localDateTimeQ2 = yk2.q(leaderboardValueParentInfoNetworkEntity2.d);
        localDateTimeQ2.getClass();
        LeaderboardValueParentInfoModel leaderboardValueParentInfoModel2 = new LeaderboardValueParentInfoModel(i7, leaderboardPlanModelC, leaderboardSectionModel, localDateTimeQ2);
        leaderboardPerformanceNetworkEntity = leaderboardValueDetailsResponse.b;
        if (leaderboardPerformanceNetworkEntity != null) {
            int i8 = leaderboardPerformanceNetworkEntity.a;
            String str4 = leaderboardPerformanceNetworkEntity.b;
            list = leaderboardPerformanceNetworkEntity.c;
            if (list != null) {
                arrayList2 = new ArrayList(ph1.n(list, 10));
                it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((SectionAttachmentNetworkEntity) it.next()).a());
                }
            } else {
                arrayList2 = hf3Var;
            }
            leaderboardPerformanceModel = new LeaderboardPerformanceModel(i8, str4, arrayList2);
        } else {
            leaderboardPerformanceModel = null;
        }
        return new LeaderboardValueDetailsModel(i4, z2, iIntValue, iIntValue2, iIntValue3, z3, z4, topValueKind, list3, str, str2, strName, leaderboardUserModel, z5, z, other, leaderboardValueParentInfoModel2, leaderboardPerformanceModel);
    }
}

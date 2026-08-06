package com.hwpo_training_app.leaderboards.common.domain.entity;

import com.hwpo_training_app.leaderboards.common.data.network.request.LeaderboardKindNetworkEntity;
import com.hwpo_training_app.leaderboards.common.data.network.request.LeaderboardPlanTypeNetworkEntity;
import com.hwpo_training_app.leaderboards.common.data.network.response.LeaderboardMeasureNetworkEntity;
import com.hwpo_training_app.leaderboards.common.data.network.response.LeaderboardNetworkEntity;
import com.hwpo_training_app.leaderboards.common.data.network.response.LeaderboardPlanNetworkEntity;
import com.hwpo_training_app.leaderboards.common.data.network.response.LeaderboardResultTypeNetworkEntity;
import com.hwpo_training_app.leaderboards.common.data.network.response.LeaderboardScheduleNetworkEntity;
import com.hwpo_training_app.leaderboards.common.data.network.response.LeaderboardScoreSubValueNetworkEntity;
import com.hwpo_training_app.leaderboards.common.data.network.response.LeaderboardSectionNetworkEntity;
import com.hwpo_training_app.leaderboards.common.data.network.response.LeaderboardTopValueNetworkEntity;
import com.hwpo_training_app.leaderboards.common.data.network.response.LeaderboardUserNetworkEntity;
import defpackage.hf3;
import defpackage.m2b;
import defpackage.ph1;
import defpackage.u;
import defpackage.wk6;
import defpackage.xn0;
import defpackage.yk2;
import defpackage.z90;
import j$.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class DomainEntitiesMapperKt {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[LeaderboardType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[LeaderboardKindNetworkEntity.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                LeaderboardKindNetworkEntity.Companion companion = LeaderboardKindNetworkEntity.Companion;
                iArr2[3] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                LeaderboardKindNetworkEntity.Companion companion2 = LeaderboardKindNetworkEntity.Companion;
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                LeaderboardKindNetworkEntity.Companion companion3 = LeaderboardKindNetworkEntity.Companion;
                iArr2[1] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[LeaderboardPlanTypeNetworkEntity.values().length];
            try {
                iArr3[0] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                LeaderboardPlanTypeNetworkEntity.Companion companion4 = LeaderboardPlanTypeNetworkEntity.Companion;
                iArr3[1] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                LeaderboardPlanTypeNetworkEntity.Companion companion5 = LeaderboardPlanTypeNetworkEntity.Companion;
                iArr3[2] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr4 = new int[LeaderboardMeasureNetworkEntity.values().length];
            try {
                iArr4[0] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                LeaderboardMeasureNetworkEntity.Companion companion6 = LeaderboardMeasureNetworkEntity.Companion;
                iArr4[1] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                LeaderboardMeasureNetworkEntity.Companion companion7 = LeaderboardMeasureNetworkEntity.Companion;
                iArr4[2] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                LeaderboardMeasureNetworkEntity.Companion companion8 = LeaderboardMeasureNetworkEntity.Companion;
                iArr4[3] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                LeaderboardMeasureNetworkEntity.Companion companion9 = LeaderboardMeasureNetworkEntity.Companion;
                iArr4[4] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                LeaderboardMeasureNetworkEntity.Companion companion10 = LeaderboardMeasureNetworkEntity.Companion;
                iArr4[5] = 6;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                LeaderboardMeasureNetworkEntity.Companion companion11 = LeaderboardMeasureNetworkEntity.Companion;
                iArr4[6] = 7;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                LeaderboardMeasureNetworkEntity.Companion companion12 = LeaderboardMeasureNetworkEntity.Companion;
                iArr4[7] = 8;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                LeaderboardMeasureNetworkEntity.Companion companion13 = LeaderboardMeasureNetworkEntity.Companion;
                iArr4[8] = 9;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                LeaderboardMeasureNetworkEntity.Companion companion14 = LeaderboardMeasureNetworkEntity.Companion;
                iArr4[9] = 10;
            } catch (NoSuchFieldError unused19) {
            }
        }
    }

    public static final LeaderboardMeasureType a(LeaderboardMeasureNetworkEntity leaderboardMeasureNetworkEntity) {
        leaderboardMeasureNetworkEntity.getClass();
        switch (leaderboardMeasureNetworkEntity.ordinal()) {
            case 0:
                return LeaderboardMeasureType.t;
            case 1:
                return LeaderboardMeasureType.u;
            case 2:
                return LeaderboardMeasureType.v;
            case 3:
                return LeaderboardMeasureType.w;
            case 4:
                return LeaderboardMeasureType.x;
            case 5:
                return LeaderboardMeasureType.y;
            case 6:
                return LeaderboardMeasureType.z;
            case 7:
                return LeaderboardMeasureType.A;
            case 8:
                return LeaderboardMeasureType.B;
            case 9:
                return LeaderboardMeasureType.C;
            default:
                u.b();
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0098  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:49:0x00bf A[LOOP:0: B:47:0x00b9->B:49:0x00bf, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:51:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d7  */
    public static final LeaderboardModel b(LeaderboardNetworkEntity leaderboardNetworkEntity, boolean z) {
        LeaderboardType leaderboardType;
        int i;
        LeaderboardScheduleModel leaderboardScheduleModel;
        Long l;
        LocalDateTime localDateTimeQ;
        List<LeaderboardTopValueNetworkEntity> list;
        ArrayList arrayList;
        ArrayList arrayList2;
        Iterator<T> it;
        leaderboardNetworkEntity.getClass();
        int i2 = leaderboardNetworkEntity.a;
        String str = leaderboardNetworkEntity.b;
        String str2 = leaderboardNetworkEntity.c;
        LeaderboardKindNetworkEntity leaderboardKindNetworkEntity = leaderboardNetworkEntity.d;
        leaderboardKindNetworkEntity.getClass();
        int iOrdinal = leaderboardKindNetworkEntity.ordinal();
        if (iOrdinal == 0) {
            leaderboardType = LeaderboardType.t;
        } else {
            if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                u.b();
                return null;
            }
            leaderboardType = LeaderboardType.u;
        }
        xn0 xn0VarA = leaderboardNetworkEntity.e.a();
        Integer num = leaderboardNetworkEntity.f;
        Integer num2 = leaderboardNetworkEntity.g;
        Integer num3 = leaderboardNetworkEntity.h;
        LeaderboardPlanNetworkEntity leaderboardPlanNetworkEntity = leaderboardNetworkEntity.i;
        LeaderboardPlanModel leaderboardPlanModelC = leaderboardPlanNetworkEntity != null ? c(leaderboardPlanNetworkEntity) : null;
        LeaderboardSectionNetworkEntity leaderboardSectionNetworkEntity = leaderboardNetworkEntity.j;
        LeaderboardSectionModel leaderboardSectionModel = leaderboardSectionNetworkEntity != null ? new LeaderboardSectionModel(leaderboardSectionNetworkEntity.a, leaderboardSectionNetworkEntity.b, leaderboardSectionNetworkEntity.c) : null;
        List<String> list2 = leaderboardNetworkEntity.k;
        List<String> list3 = hf3.t;
        if (list2 == null) {
            list2 = list3;
        }
        Integer num4 = leaderboardNetworkEntity.l;
        int iIntValue = num4 != null ? num4.intValue() : 0;
        LeaderboardScheduleNetworkEntity leaderboardScheduleNetworkEntity = leaderboardNetworkEntity.m;
        if (leaderboardScheduleNetworkEntity != null) {
            i = i2;
            Integer num5 = leaderboardScheduleNetworkEntity.a;
            if (num5 != null) {
                int iIntValue2 = num5.intValue();
                String str3 = leaderboardScheduleNetworkEntity.b;
                if (str3 != null) {
                    leaderboardScheduleModel = new LeaderboardScheduleModel(iIntValue2, str3);
                }
            }
            m2b m2bVarA = leaderboardNetworkEntity.n.a();
            String str4 = leaderboardNetworkEntity.o;
            String str5 = leaderboardNetworkEntity.p;
            l = leaderboardNetworkEntity.q;
            if (l != null) {
                localDateTimeQ = yk2.q(l.longValue());
            } else {
                localDateTimeQ = null;
            }
            list = leaderboardNetworkEntity.r;
            LocalDateTime localDateTime = localDateTimeQ;
            if (list != null) {
                arrayList2 = new ArrayList(ph1.n(list, 10));
                it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(e((LeaderboardTopValueNetworkEntity) it.next()));
                }
                arrayList = arrayList2;
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                list3 = arrayList;
            }
            return new LeaderboardModel(i, str, str2, leaderboardType, xn0VarA, num, num2, num3, leaderboardPlanModelC, leaderboardSectionModel, list2, iIntValue, leaderboardScheduleModel, m2bVarA, str4, str5, localDateTime, list3, z);
        }
        i = i2;
        leaderboardScheduleModel = null;
        m2b m2bVarA2 = leaderboardNetworkEntity.n.a();
        String str6 = leaderboardNetworkEntity.o;
        String str7 = leaderboardNetworkEntity.p;
        l = leaderboardNetworkEntity.q;
        if (l != null) {
            localDateTimeQ = yk2.q(l.longValue());
        } else {
            localDateTimeQ = null;
        }
        list = leaderboardNetworkEntity.r;
        LocalDateTime localDateTime2 = localDateTimeQ;
        if (list != null) {
            arrayList2 = new ArrayList(ph1.n(list, 10));
            it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(e((LeaderboardTopValueNetworkEntity) it.next()));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            list3 = arrayList;
        }
        return new LeaderboardModel(i, str, str2, leaderboardType, xn0VarA, num, num2, num3, leaderboardPlanModelC, leaderboardSectionModel, list2, iIntValue, leaderboardScheduleModel, m2bVarA2, str6, str7, localDateTime2, list3, z);
    }

    public static final LeaderboardPlanModel c(LeaderboardPlanNetworkEntity leaderboardPlanNetworkEntity) {
        LeaderboardPlanType leaderboardPlanType;
        leaderboardPlanNetworkEntity.getClass();
        int i = leaderboardPlanNetworkEntity.a;
        String str = leaderboardPlanNetworkEntity.b;
        LeaderboardPlanTypeNetworkEntity leaderboardPlanTypeNetworkEntity = leaderboardPlanNetworkEntity.c;
        leaderboardPlanTypeNetworkEntity.getClass();
        int iOrdinal = leaderboardPlanTypeNetworkEntity.ordinal();
        if (iOrdinal == 0) {
            leaderboardPlanType = LeaderboardPlanType.t;
        } else if (iOrdinal == 1) {
            leaderboardPlanType = LeaderboardPlanType.u;
        } else {
            if (iOrdinal != 2) {
                u.b();
                return null;
            }
            leaderboardPlanType = LeaderboardPlanType.v;
        }
        return new LeaderboardPlanModel(i, str, leaderboardPlanType);
    }

    public static final LeaderboardScoreSubValueModel d(LeaderboardScoreSubValueNetworkEntity leaderboardScoreSubValueNetworkEntity, LeaderboardResultTypeNetworkEntity leaderboardResultTypeNetworkEntity) {
        LeaderboardScoreResultModel roundReps;
        leaderboardScoreSubValueNetworkEntity.getClass();
        LeaderboardMeasureNetworkEntity leaderboardMeasureNetworkEntity = leaderboardScoreSubValueNetworkEntity.i;
        leaderboardResultTypeNetworkEntity.getClass();
        int i = leaderboardScoreSubValueNetworkEntity.a;
        int i2 = leaderboardScoreSubValueNetworkEntity.d;
        Boolean bool = leaderboardScoreSubValueNetworkEntity.e;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        Integer num = leaderboardScoreSubValueNetworkEntity.b;
        Integer num2 = leaderboardScoreSubValueNetworkEntity.c;
        float f = leaderboardScoreSubValueNetworkEntity.f;
        int iOrdinal = leaderboardResultTypeNetworkEntity.ordinal();
        if (iOrdinal == 0) {
            int iB = wk6.b(f);
            if (num == null) {
                z90.a("Required value was null.");
                return null;
            }
            int iIntValue = num.intValue();
            if (num2 == null) {
                z90.a("Required value was null.");
                return null;
            }
            roundReps = new LeaderboardScoreResultModel.RoundReps(iB, iIntValue, num2.intValue());
        } else if (iOrdinal == 1) {
            roundReps = new LeaderboardScoreResultModel.TimeCap((num == null || num2 == null) ? new TimeCapModel.Time(wk6.b(f)) : new TimeCapModel.RoundReps(num.intValue(), num2.intValue(), wk6.b(f)));
        } else {
            if (iOrdinal != 2) {
                u.b();
                return null;
            }
            roundReps = new LeaderboardScoreResultModel.Other(f, leaderboardScoreSubValueNetworkEntity.h, a(leaderboardMeasureNetworkEntity));
        }
        return new LeaderboardScoreSubValueModel(i, i2, zBooleanValue, roundReps, a(leaderboardMeasureNetworkEntity));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v4, types: [hf3] */
    /* JADX WARN: Type inference failed for: r14v5, types: [java.util.ArrayList] */
    public static final LeaderboardTopValueModel e(LeaderboardTopValueNetworkEntity leaderboardTopValueNetworkEntity) {
        ?? arrayList;
        int i;
        LeaderboardScoreResultModel roundReps;
        LeaderboardScoreResultModel other;
        leaderboardTopValueNetworkEntity.getClass();
        LeaderboardMeasureNetworkEntity leaderboardMeasureNetworkEntity = leaderboardTopValueNetworkEntity.p;
        LeaderboardResultTypeNetworkEntity leaderboardResultTypeNetworkEntity = leaderboardTopValueNetworkEntity.r;
        int i2 = leaderboardTopValueNetworkEntity.a;
        Integer numValueOf = Integer.valueOf(leaderboardTopValueNetworkEntity.b);
        boolean z = leaderboardTopValueNetworkEntity.c;
        Integer num = leaderboardTopValueNetworkEntity.d;
        int iIntValue = num != null ? num.intValue() : 0;
        Integer num2 = leaderboardTopValueNetworkEntity.e;
        int iIntValue2 = num2 != null ? num2.intValue() : 0;
        Integer num3 = leaderboardTopValueNetworkEntity.f;
        int iIntValue3 = num3 != null ? num3.intValue() : 0;
        boolean z2 = leaderboardTopValueNetworkEntity.i;
        boolean z3 = leaderboardTopValueNetworkEntity.j;
        TopValueKind topValueKind = leaderboardTopValueNetworkEntity.k ? TopValueKind.u : TopValueKind.t;
        List<LeaderboardScoreSubValueNetworkEntity> list = leaderboardTopValueNetworkEntity.m;
        if (list != null) {
            arrayList = new ArrayList(ph1.n(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(d((LeaderboardScoreSubValueNetworkEntity) it.next(), leaderboardResultTypeNetworkEntity));
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = hf3.t;
        }
        String str = leaderboardTopValueNetworkEntity.n;
        String str2 = leaderboardTopValueNetworkEntity.o;
        String strName = leaderboardMeasureNetworkEntity.name();
        LeaderboardUserNetworkEntity leaderboardUserNetworkEntity = leaderboardTopValueNetworkEntity.q;
        leaderboardUserNetworkEntity.getClass();
        LeaderboardUserModel leaderboardUserModel = new LeaderboardUserModel(leaderboardUserNetworkEntity.a, leaderboardUserNetworkEntity.e, leaderboardUserNetworkEntity.b, leaderboardUserNetworkEntity.c, leaderboardUserNetworkEntity.d, leaderboardUserNetworkEntity.f);
        boolean z4 = leaderboardTopValueNetworkEntity.s;
        boolean z5 = leaderboardTopValueNetworkEntity.t;
        Integer num4 = leaderboardTopValueNetworkEntity.g;
        Integer num5 = leaderboardTopValueNetworkEntity.h;
        float f = leaderboardTopValueNetworkEntity.l;
        int iOrdinal = leaderboardResultTypeNetworkEntity.ordinal();
        if (iOrdinal != 0) {
            i = iIntValue;
            if (iOrdinal == 1) {
                roundReps = new LeaderboardScoreResultModel.TimeCap((num4 == null || num5 == null) ? new TimeCapModel.Time(wk6.b(f)) : new TimeCapModel.RoundReps(num4.intValue(), num5.intValue(), wk6.b(f)));
            } else {
                if (iOrdinal != 2) {
                    u.b();
                    return null;
                }
                other = new LeaderboardScoreResultModel.Other(f, leaderboardTopValueNetworkEntity.o, a(leaderboardMeasureNetworkEntity));
                i2 = i2;
            }
            return new LeaderboardTopValueModel(i2, numValueOf, z, i, iIntValue2, iIntValue3, z2, z3, topValueKind, arrayList, str, str2, strName, leaderboardUserModel, z4, z5, other);
        }
        i = iIntValue;
        i2 = i2;
        int iB = wk6.b(f);
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
        return new LeaderboardTopValueModel(i2, numValueOf, z, i, iIntValue2, iIntValue3, z2, z3, topValueKind, arrayList, str, str2, strName, leaderboardUserModel, z4, z5, other);
    }
}

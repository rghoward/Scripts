package com.hwpo_training_app.leaderboards.list.common.data;

import com.hwpo_training_app.core.data.model.pagination.PagingPaginationNetworkEntity;
import com.hwpo_training_app.leaderboards.common.data.network.request.LeaderboardTypeNetworkEntity;
import com.hwpo_training_app.leaderboards.common.data.network.response.LeaderboardNetworkEntity;
import com.hwpo_training_app.leaderboards.common.domain.entity.DomainEntitiesMapperKt;
import com.hwpo_training_app.leaderboards.common.domain.entity.LeaderboardModel;
import com.hwpo_training_app.leaderboards.common.domain.entity.LeaderboardType;
import com.hwpo_training_app.leaderboards.filter.domain.HasGymFilter;
import com.hwpo_training_app.leaderboards.filter.list.domain.LeaderboardFiltersStorage;
import com.hwpo_training_app.leaderboards.filter.list.domain.entity.LeaderboardFiltersModel;
import com.hwpo_training_app.leaderboards.list.common.data.network.api.LeaderboardsListApi;
import com.hwpo_training_app.leaderboards.list.common.data.network.response.LeaderboardsListResponse;
import com.hwpo_training_app.leaderboards.list.common.domain.LeaderboardsRepository;
import com.hwpo_training_app.leaderboards.list.common.domain.LeaderboardsStorage;
import defpackage.aa0;
import defpackage.dv8;
import defpackage.g2b;
import defpackage.gl8;
import defpackage.js7;
import defpackage.li8;
import defpackage.pc2;
import defpackage.ph1;
import defpackage.r54;
import defpackage.u;
import defpackage.u02;
import defpackage.v72;
import defpackage.ws0;
import defpackage.yk2;
import defpackage.z2a;
import j$.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class LeaderboardsRepositoryImpl implements LeaderboardsRepository {
    public final LeaderboardsListApi a;
    public final LeaderboardsStorage b;
    public final LeaderboardFiltersStorage c;
    public final pc2 d;
    public final r54<List<LeaderboardModel>> e;

    public LeaderboardsRepositoryImpl(LeaderboardsListApi leaderboardsListApi, LeaderboardsStorage leaderboardsStorage, LeaderboardFiltersStorage leaderboardFiltersStorage, pc2 pc2Var) {
        leaderboardsListApi.getClass();
        leaderboardsStorage.getClass();
        leaderboardFiltersStorage.getClass();
        pc2Var.getClass();
        this.a = leaderboardsListApi;
        this.b = leaderboardsStorage;
        this.c = leaderboardFiltersStorage;
        this.d = pc2Var;
        this.e = leaderboardsStorage.a();
    }

    /* JADX WARN: Code duplicated, block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x0141 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x0143  */
    /* JADX WARN: Code duplicated, block: B:59:0x0146  */
    /* JADX WARN: Code duplicated, block: B:61:0x014a  */
    /* JADX WARN: Code duplicated, block: B:65:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:68:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:69:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:72:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:76:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x01ef A[LOOP:0: B:78:0x01e9->B:80:0x01ef, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:83:0x0201  */
    /* JADX WARN: Code duplicated, block: B:86:0x021d  */
    /* JADX WARN: Code duplicated, block: B:89:0x0236  */
    /* JADX WARN: Code duplicated, block: B:92:0x0240  */
    /* JADX WARN: Code duplicated, block: B:98:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v19, types: [T, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v6, types: [T, java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8, types: [com.hwpo_training_app.leaderboards.common.domain.entity.LeaderboardType, com.hwpo_training_app.leaderboards.filter.list.domain.entity.LeaderboardFiltersModel, java.lang.Integer, java.lang.Long] */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final Object a(LeaderboardType leaderboardType, boolean z, u02 u02Var) throws Throwable {
        LeaderboardsRepositoryImpl$fetchLeaderboards$1 leaderboardsRepositoryImpl$fetchLeaderboards$1;
        LeaderboardType leaderboardType2;
        boolean z2;
        js7 js7Var;
        Long l;
        Long l2;
        Integer num;
        Object objA;
        LeaderboardFiltersModel leaderboardFiltersModel;
        boolean z3;
        Integer num2;
        LeaderboardType leaderboardType3;
        Integer num3;
        int iOrdinal;
        LeaderboardTypeNetworkEntity leaderboardTypeNetworkEntity;
        LeaderboardFiltersModel leaderboardFiltersModel2;
        LeaderboardType leaderboardType4;
        boolean z4;
        v72 v72Var;
        int i;
        Object objA2;
        LeaderboardsRepositoryImpl$fetchLeaderboards$1 leaderboardsRepositoryImpl$fetchLeaderboards$2;
        LeaderboardType leaderboardType5;
        LeaderboardFiltersModel leaderboardFiltersModel3;
        boolean z5;
        PagingPaginationNetworkEntity pagingPaginationNetworkEntity;
        int i2;
        int i3;
        String str;
        boolean z6;
        boolean z7;
        ?? arrayList;
        Iterator<T> it;
        ?? r8;
        List list;
        if (u02Var instanceof LeaderboardsRepositoryImpl$fetchLeaderboards$1) {
            leaderboardsRepositoryImpl$fetchLeaderboards$1 = (LeaderboardsRepositoryImpl$fetchLeaderboards$1) u02Var;
            int i4 = leaderboardsRepositoryImpl$fetchLeaderboards$1.E;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                leaderboardsRepositoryImpl$fetchLeaderboards$1.E = i4 - Integer.MIN_VALUE;
            } else {
                leaderboardsRepositoryImpl$fetchLeaderboards$1 = new LeaderboardsRepositoryImpl$fetchLeaderboards$1(this, u02Var);
            }
        } else {
            leaderboardsRepositoryImpl$fetchLeaderboards$1 = new LeaderboardsRepositoryImpl$fetchLeaderboards$1(this, u02Var);
        }
        Object objK = leaderboardsRepositoryImpl$fetchLeaderboards$1.C;
        int i5 = leaderboardsRepositoryImpl$fetchLeaderboards$1.E;
        LeaderboardsStorage leaderboardsStorage = this.b;
        v72 v72Var2 = v72.t;
        if (i5 == 0) {
            dv8.b(objK);
            li8 li8VarA = this.c.a();
            leaderboardType2 = leaderboardType;
            leaderboardsRepositoryImpl$fetchLeaderboards$1.t = leaderboardType2;
            z2 = z;
            leaderboardsRepositoryImpl$fetchLeaderboards$1.B = z2;
            leaderboardsRepositoryImpl$fetchLeaderboards$1.E = 1;
            objK = yk2.k(li8VarA, leaderboardsRepositoryImpl$fetchLeaderboards$1);
            if (objK != v72Var2) {
            }
            return v72Var2;
        }
        if (i5 == 1) {
            boolean z8 = leaderboardsRepositoryImpl$fetchLeaderboards$1.B;
            LeaderboardType leaderboardType6 = leaderboardsRepositoryImpl$fetchLeaderboards$1.t;
            dv8.b(objK);
            z2 = z8;
            leaderboardType2 = leaderboardType6;
        } else if (i5 == 2) {
            boolean z9 = leaderboardsRepositoryImpl$fetchLeaderboards$1.B;
            Integer num4 = leaderboardsRepositoryImpl$fetchLeaderboards$1.z;
            num = leaderboardsRepositoryImpl$fetchLeaderboards$1.y;
            l2 = leaderboardsRepositoryImpl$fetchLeaderboards$1.x;
            l = leaderboardsRepositoryImpl$fetchLeaderboards$1.w;
            Integer num5 = leaderboardsRepositoryImpl$fetchLeaderboards$1.v;
            LeaderboardFiltersModel leaderboardFiltersModel4 = leaderboardsRepositoryImpl$fetchLeaderboards$1.u;
            LeaderboardType leaderboardType7 = leaderboardsRepositoryImpl$fetchLeaderboards$1.t;
            dv8.b(objK);
            num3 = num5;
            num2 = num4;
            leaderboardType3 = leaderboardType7;
            objA = objK;
            z3 = z9;
            leaderboardFiltersModel = leaderboardFiltersModel4;
            js7 js7Var2 = (js7) objA;
            Integer num6 = (Integer) js7Var2.t;
            String str2 = (String) js7Var2.u;
            leaderboardType3.getClass();
            iOrdinal = leaderboardType3.ordinal();
            if (iOrdinal != 0) {
                leaderboardTypeNetworkEntity = LeaderboardTypeNetworkEntity.LEADERBOARD;
            } else {
                if (iOrdinal == 1) {
                    u.b();
                    return null;
                }
                leaderboardTypeNetworkEntity = LeaderboardTypeNetworkEntity.CHALLENGE;
            }
            String str3 = leaderboardTypeNetworkEntity.t;
            String str4 = leaderboardFiltersModel.h;
            boolean z10 = !leaderboardFiltersModel.a;
            boolean z11 = leaderboardFiltersModel.b;
            leaderboardsStorage.getClass();
            Boolean boolValueOf = Boolean.valueOf(z10);
            Boolean boolValueOf2 = Boolean.valueOf(z11);
            leaderboardsRepositoryImpl$fetchLeaderboards$1.t = leaderboardType3;
            leaderboardsRepositoryImpl$fetchLeaderboards$1.u = leaderboardFiltersModel;
            leaderboardFiltersModel2 = leaderboardFiltersModel;
            leaderboardsRepositoryImpl$fetchLeaderboards$1.v = null;
            leaderboardsRepositoryImpl$fetchLeaderboards$1.w = null;
            leaderboardsRepositoryImpl$fetchLeaderboards$1.x = null;
            leaderboardsRepositoryImpl$fetchLeaderboards$1.y = null;
            leaderboardsRepositoryImpl$fetchLeaderboards$1.z = null;
            leaderboardsRepositoryImpl$fetchLeaderboards$1.B = z3;
            leaderboardsRepositoryImpl$fetchLeaderboards$1.E = 3;
            leaderboardType4 = leaderboardType3;
            z4 = z3;
            LeaderboardsRepositoryImpl$fetchLeaderboards$1 leaderboardsRepositoryImpl$fetchLeaderboards$3 = leaderboardsRepositoryImpl$fetchLeaderboards$1;
            v72Var = v72Var2;
            i = -1;
            objA2 = this.a.a(str3, str4, boolValueOf, boolValueOf2, num3, l, l2, num, num2, null, num6, str2, leaderboardsRepositoryImpl$fetchLeaderboards$3);
            leaderboardsRepositoryImpl$fetchLeaderboards$2 = leaderboardsRepositoryImpl$fetchLeaderboards$3;
            if (objA2 == v72Var) {
                return v72Var;
            }
            leaderboardType5 = leaderboardType4;
            leaderboardFiltersModel3 = leaderboardFiltersModel2;
            z5 = z4;
            LeaderboardsListResponse leaderboardsListResponse = (LeaderboardsListResponse) objA2;
            pagingPaginationNetworkEntity = leaderboardsListResponse.b;
            i2 = pagingPaginationNetworkEntity.c;
            if (i2 == pagingPaginationNetworkEntity.b) {
                i3 = i;
            } else {
                i3 = i2 + 1;
            }
            leaderboardsStorage.d(leaderboardType5, new Integer(i3));
            gl8 gl8Var = new gl8();
            str = leaderboardFiltersModel3.h;
            if (str != null) {
                z6 = true;
            } else {
                z6 = true;
            }
            z7 = !z6;
            List<LeaderboardNetworkEntity> list2 = leaderboardsListResponse.a;
            arrayList = new ArrayList(ph1.n(list2, 10));
            it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(DomainEntitiesMapperKt.b((LeaderboardNetworkEntity) it.next(), z7));
            }
            gl8Var.t = arrayList;
            if (z5) {
                r8 = 0;
            } else {
                r8 = 0;
            }
            list = (List) gl8Var.t;
            leaderboardsRepositoryImpl$fetchLeaderboards$2.t = r8;
            leaderboardsRepositoryImpl$fetchLeaderboards$2.u = r8;
            leaderboardsRepositoryImpl$fetchLeaderboards$2.v = r8;
            leaderboardsRepositoryImpl$fetchLeaderboards$2.w = r8;
            leaderboardsRepositoryImpl$fetchLeaderboards$2.x = r8;
            leaderboardsRepositoryImpl$fetchLeaderboards$2.y = r8;
            leaderboardsRepositoryImpl$fetchLeaderboards$2.z = r8;
            leaderboardsRepositoryImpl$fetchLeaderboards$2.A = leaderboardsStorage;
            leaderboardsRepositoryImpl$fetchLeaderboards$2.B = z5;
            if (z5) {
                leaderboardsRepositoryImpl$fetchLeaderboards$2.E = 4;
                if (leaderboardsStorage.e(leaderboardType5, list) == v72Var) {
                    return v72Var;
                }
            } else {
                leaderboardsRepositoryImpl$fetchLeaderboards$2.E = 5;
                if (leaderboardsStorage.b(list) == v72Var) {
                    return v72Var;
                }
            }
        } else if (i5 == 3) {
            boolean z12 = leaderboardsRepositoryImpl$fetchLeaderboards$1.B;
            LeaderboardFiltersModel leaderboardFiltersModel5 = leaderboardsRepositoryImpl$fetchLeaderboards$1.u;
            leaderboardType5 = leaderboardsRepositoryImpl$fetchLeaderboards$1.t;
            dv8.b(objK);
            leaderboardFiltersModel3 = leaderboardFiltersModel5;
            i = -1;
            objA2 = objK;
            leaderboardsRepositoryImpl$fetchLeaderboards$2 = leaderboardsRepositoryImpl$fetchLeaderboards$1;
            v72Var = v72Var2;
            z5 = z12;
            LeaderboardsListResponse leaderboardsListResponse2 = (LeaderboardsListResponse) objA2;
            pagingPaginationNetworkEntity = leaderboardsListResponse2.b;
            i2 = pagingPaginationNetworkEntity.c;
            if (i2 == pagingPaginationNetworkEntity.b) {
                i3 = i;
            } else {
                i3 = i2 + 1;
            }
            leaderboardsStorage.d(leaderboardType5, new Integer(i3));
            gl8 gl8Var2 = new gl8();
            str = leaderboardFiltersModel3.h;
            if (str != null || z2a.w(str)) {
                z6 = true;
            } else {
                z6 = false;
            }
            z7 = !z6;
            List<LeaderboardNetworkEntity> list3 = leaderboardsListResponse2.a;
            arrayList = new ArrayList(ph1.n(list3, 10));
            it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(DomainEntitiesMapperKt.b((LeaderboardNetworkEntity) it.next(), z7));
            }
            gl8Var2.t = arrayList;
            if (z5 || !arrayList.isEmpty()) {
                r8 = 0;
            } else {
                LeaderboardModel.Companion.getClass();
                r8 = 0;
                gl8Var2.t = ws0.h(LeaderboardModel.a(LeaderboardModel.t, leaderboardType5, null, 524279));
            }
            list = (List) gl8Var2.t;
            leaderboardsRepositoryImpl$fetchLeaderboards$2.t = r8;
            leaderboardsRepositoryImpl$fetchLeaderboards$2.u = r8;
            leaderboardsRepositoryImpl$fetchLeaderboards$2.v = r8;
            leaderboardsRepositoryImpl$fetchLeaderboards$2.w = r8;
            leaderboardsRepositoryImpl$fetchLeaderboards$2.x = r8;
            leaderboardsRepositoryImpl$fetchLeaderboards$2.y = r8;
            leaderboardsRepositoryImpl$fetchLeaderboards$2.z = r8;
            leaderboardsRepositoryImpl$fetchLeaderboards$2.A = leaderboardsStorage;
            leaderboardsRepositoryImpl$fetchLeaderboards$2.B = z5;
            if (z5) {
                leaderboardsRepositoryImpl$fetchLeaderboards$2.E = 4;
                if (leaderboardsStorage.e(leaderboardType5, list) == v72Var) {
                    return v72Var;
                }
            } else {
                leaderboardsRepositoryImpl$fetchLeaderboards$2.E = 5;
                if (leaderboardsStorage.b(list) == v72Var) {
                    return v72Var;
                }
            }
        } else {
            if (i5 != 4 && i5 != 5) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(objK);
        }
        return g2b.a;
        LeaderboardFiltersModel leaderboardFiltersModel6 = (LeaderboardFiltersModel) objK;
        Integer numC = !z2 ? leaderboardsStorage.c(leaderboardType2) : null;
        if (numC != null && numC.intValue() == -1) {
            return g2b.a;
        }
        if (leaderboardFiltersModel6.g) {
            js7Var = new js7(null, null);
        } else {
            LocalDate localDate = leaderboardFiltersModel6.c;
            Long l3 = localDate != null ? new Long(yk2.y(localDate)) : null;
            LocalDate localDate2 = leaderboardFiltersModel6.d;
            js7Var = new js7(l3, localDate2 != null ? new Long(yk2.y(localDate2)) : null);
        }
        l = (Long) js7Var.t;
        l2 = (Long) js7Var.u;
        js7 js7Var3 = !leaderboardFiltersModel6.g ? new js7(null, null) : new js7(leaderboardFiltersModel6.e, leaderboardFiltersModel6.f);
        num = (Integer) js7Var3.t;
        Integer num7 = (Integer) js7Var3.u;
        leaderboardsRepositoryImpl$fetchLeaderboards$1.t = leaderboardType2;
        leaderboardsRepositoryImpl$fetchLeaderboards$1.u = leaderboardFiltersModel6;
        leaderboardsRepositoryImpl$fetchLeaderboards$1.v = numC;
        leaderboardsRepositoryImpl$fetchLeaderboards$1.w = l;
        leaderboardsRepositoryImpl$fetchLeaderboards$1.x = l2;
        leaderboardsRepositoryImpl$fetchLeaderboards$1.y = num;
        leaderboardsRepositoryImpl$fetchLeaderboards$1.z = num7;
        leaderboardsRepositoryImpl$fetchLeaderboards$1.B = z2;
        leaderboardsRepositoryImpl$fetchLeaderboards$1.E = 2;
        objA = HasGymFilter.a(leaderboardFiltersModel6, this.d, leaderboardsRepositoryImpl$fetchLeaderboards$1);
        if (objA != v72Var2) {
            LeaderboardType leaderboardType8 = leaderboardType2;
            leaderboardFiltersModel = leaderboardFiltersModel6;
            z3 = z2;
            num2 = num7;
            leaderboardType3 = leaderboardType8;
            num3 = numC;
            js7 js7Var4 = (js7) objA;
            Integer num8 = (Integer) js7Var4.t;
            String str5 = (String) js7Var4.u;
            leaderboardType3.getClass();
            iOrdinal = leaderboardType3.ordinal();
            if (iOrdinal != 0) {
                leaderboardTypeNetworkEntity = LeaderboardTypeNetworkEntity.LEADERBOARD;
            } else {
                if (iOrdinal == 1) {
                    u.b();
                    return null;
                }
                leaderboardTypeNetworkEntity = LeaderboardTypeNetworkEntity.CHALLENGE;
            }
            String str6 = leaderboardTypeNetworkEntity.t;
            String str7 = leaderboardFiltersModel.h;
            boolean z13 = !leaderboardFiltersModel.a;
            boolean z14 = leaderboardFiltersModel.b;
            leaderboardsStorage.getClass();
            Boolean boolValueOf3 = Boolean.valueOf(z13);
            Boolean boolValueOf4 = Boolean.valueOf(z14);
            leaderboardsRepositoryImpl$fetchLeaderboards$1.t = leaderboardType3;
            leaderboardsRepositoryImpl$fetchLeaderboards$1.u = leaderboardFiltersModel;
            leaderboardFiltersModel2 = leaderboardFiltersModel;
            leaderboardsRepositoryImpl$fetchLeaderboards$1.v = null;
            leaderboardsRepositoryImpl$fetchLeaderboards$1.w = null;
            leaderboardsRepositoryImpl$fetchLeaderboards$1.x = null;
            leaderboardsRepositoryImpl$fetchLeaderboards$1.y = null;
            leaderboardsRepositoryImpl$fetchLeaderboards$1.z = null;
            leaderboardsRepositoryImpl$fetchLeaderboards$1.B = z3;
            leaderboardsRepositoryImpl$fetchLeaderboards$1.E = 3;
            leaderboardType4 = leaderboardType3;
            z4 = z3;
            LeaderboardsRepositoryImpl$fetchLeaderboards$1 leaderboardsRepositoryImpl$fetchLeaderboards$4 = leaderboardsRepositoryImpl$fetchLeaderboards$1;
            v72Var = v72Var2;
            i = -1;
            objA2 = this.a.a(str6, str7, boolValueOf3, boolValueOf4, num3, l, l2, num, num2, null, num8, str5, leaderboardsRepositoryImpl$fetchLeaderboards$4);
            leaderboardsRepositoryImpl$fetchLeaderboards$2 = leaderboardsRepositoryImpl$fetchLeaderboards$4;
            if (objA2 == v72Var) {
                return v72Var;
            }
            leaderboardType5 = leaderboardType4;
            leaderboardFiltersModel3 = leaderboardFiltersModel2;
            z5 = z4;
            LeaderboardsListResponse leaderboardsListResponse3 = (LeaderboardsListResponse) objA2;
            pagingPaginationNetworkEntity = leaderboardsListResponse3.b;
            i2 = pagingPaginationNetworkEntity.c;
            if (i2 == pagingPaginationNetworkEntity.b) {
                i3 = i;
            } else {
                i3 = i2 + 1;
            }
            leaderboardsStorage.d(leaderboardType5, new Integer(i3));
            gl8 gl8Var3 = new gl8();
            str = leaderboardFiltersModel3.h;
            if (str != null) {
                z6 = true;
            } else {
                z6 = true;
            }
            z7 = !z6;
            List<LeaderboardNetworkEntity> list4 = leaderboardsListResponse3.a;
            arrayList = new ArrayList(ph1.n(list4, 10));
            it = list4.iterator();
            while (it.hasNext()) {
                arrayList.add(DomainEntitiesMapperKt.b((LeaderboardNetworkEntity) it.next(), z7));
            }
            gl8Var3.t = arrayList;
            if (z5) {
                r8 = 0;
            } else {
                r8 = 0;
            }
            list = (List) gl8Var3.t;
            leaderboardsRepositoryImpl$fetchLeaderboards$2.t = r8;
            leaderboardsRepositoryImpl$fetchLeaderboards$2.u = r8;
            leaderboardsRepositoryImpl$fetchLeaderboards$2.v = r8;
            leaderboardsRepositoryImpl$fetchLeaderboards$2.w = r8;
            leaderboardsRepositoryImpl$fetchLeaderboards$2.x = r8;
            leaderboardsRepositoryImpl$fetchLeaderboards$2.y = r8;
            leaderboardsRepositoryImpl$fetchLeaderboards$2.z = r8;
            leaderboardsRepositoryImpl$fetchLeaderboards$2.A = leaderboardsStorage;
            leaderboardsRepositoryImpl$fetchLeaderboards$2.B = z5;
            if (z5) {
                leaderboardsRepositoryImpl$fetchLeaderboards$2.E = 4;
                if (leaderboardsStorage.e(leaderboardType5, list) == v72Var) {
                    return v72Var;
                }
            } else {
                leaderboardsRepositoryImpl$fetchLeaderboards$2.E = 5;
                if (leaderboardsStorage.b(list) == v72Var) {
                    return v72Var;
                }
            }
            return g2b.a;
        }
        return v72Var2;
    }
}

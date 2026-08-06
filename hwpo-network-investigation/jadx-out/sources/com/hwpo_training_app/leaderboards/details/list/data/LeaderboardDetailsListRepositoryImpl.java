package com.hwpo_training_app.leaderboards.details.list.data;

import com.hwpo_training_app.core.data.model.pagination.PagingPaginationNetworkEntity;
import com.hwpo_training_app.leaderboards.common.data.network.response.LeaderboardTopValueNetworkEntity;
import com.hwpo_training_app.leaderboards.common.domain.entity.DomainEntitiesMapperKt;
import com.hwpo_training_app.leaderboards.common.domain.entity.LeaderboardTopValueModel;
import com.hwpo_training_app.leaderboards.common.domain.entity.TopValueKind;
import com.hwpo_training_app.leaderboards.details.list.data.api.LeaderboardDetailsListApi;
import com.hwpo_training_app.leaderboards.details.list.data.response.AthletesListResponse;
import com.hwpo_training_app.leaderboards.details.list.domain.LeaderboardDetailsListRepository;
import com.hwpo_training_app.leaderboards.details.list.domain.LeaderboardDetailsListStorage;
import com.hwpo_training_app.leaderboards.filter.details.domain.LeaderboardDetailsFiltersStorage;
import com.hwpo_training_app.leaderboards.filter.details.domain.entity.LeaderboardDetailsFiltersModel;
import com.hwpo_training_app.leaderboards.filter.domain.HasGymFilter;
import defpackage.a0a;
import defpackage.aa0;
import defpackage.dv8;
import defpackage.g2b;
import defpackage.gl8;
import defpackage.js7;
import defpackage.li8;
import defpackage.pc2;
import defpackage.ph1;
import defpackage.r54;
import defpackage.th1;
import defpackage.u;
import defpackage.u02;
import defpackage.v72;
import defpackage.ws0;
import defpackage.yk2;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class LeaderboardDetailsListRepositoryImpl implements LeaderboardDetailsListRepository {
    public static final Companion Companion = new Companion(0);
    public final LeaderboardDetailsListApi a;
    public final LeaderboardAdditionalValueRepositoryImpl b;
    public final LeaderboardDetailsListStorage c;
    public final LeaderboardDetailsFiltersStorage d;
    public final pc2 e;
    public final r54<List<LeaderboardTopValueModel>> f;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[TopValueKind.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public LeaderboardDetailsListRepositoryImpl(LeaderboardDetailsListApi leaderboardDetailsListApi, LeaderboardAdditionalValueRepositoryImpl leaderboardAdditionalValueRepositoryImpl, LeaderboardDetailsListStorage leaderboardDetailsListStorage, LeaderboardDetailsFiltersStorage leaderboardDetailsFiltersStorage, pc2 pc2Var) {
        leaderboardDetailsListApi.getClass();
        leaderboardDetailsListStorage.getClass();
        leaderboardDetailsFiltersStorage.getClass();
        pc2Var.getClass();
        this.a = leaderboardDetailsListApi;
        this.b = leaderboardAdditionalValueRepositoryImpl;
        this.c = leaderboardDetailsListStorage;
        this.d = leaderboardDetailsFiltersStorage;
        this.e = pc2Var;
        this.f = leaderboardDetailsListStorage.m();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
    
        if (r5.c.h(r6, r7) == r4) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(int r6, boolean r7, defpackage.u02 r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.hwpo_training_app.leaderboards.details.list.data.LeaderboardDetailsListRepositoryImpl$changeResultVisibility$1
            if (r0 == 0) goto L13
            r0 = r8
            com.hwpo_training_app.leaderboards.details.list.data.LeaderboardDetailsListRepositoryImpl$changeResultVisibility$1 r0 = (com.hwpo_training_app.leaderboards.details.list.data.LeaderboardDetailsListRepositoryImpl$changeResultVisibility$1) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.x = r1
            goto L18
        L13:
            com.hwpo_training_app.leaderboards.details.list.data.LeaderboardDetailsListRepositoryImpl$changeResultVisibility$1 r0 = new com.hwpo_training_app.leaderboards.details.list.data.LeaderboardDetailsListRepositoryImpl$changeResultVisibility$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.v
            int r1 = r0.x
            r2 = 2
            r3 = 1
            v72 r4 = defpackage.v72.t
            if (r1 == 0) goto L39
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2a
            defpackage.dv8.b(r8)
            goto L5a
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r5)
            r5 = 0
            return r5
        L31:
            boolean r7 = r0.u
            int r6 = r0.t
            defpackage.dv8.b(r8)
            goto L4b
        L39:
            defpackage.dv8.b(r8)
            r0.t = r6
            r0.u = r7
            r0.x = r3
            com.hwpo_training_app.leaderboards.details.list.data.api.LeaderboardDetailsListApi r8 = r5.a
            java.lang.Object r8 = r8.a(r6, r7, r0)
            if (r8 != r4) goto L4b
            goto L59
        L4b:
            r0.t = r6
            r0.u = r7
            r0.x = r2
            com.hwpo_training_app.leaderboards.details.list.domain.LeaderboardDetailsListStorage r5 = r5.c
            g2b r5 = r5.h(r6, r7)
            if (r5 != r4) goto L5a
        L59:
            return r4
        L5a:
            g2b r5 = defpackage.g2b.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hwpo_training_app.leaderboards.details.list.data.LeaderboardDetailsListRepositoryImpl.a(int, boolean, u02):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0297  */
    /* JADX WARN: Code duplicated, block: B:105:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:108:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:111:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:117:0x025a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x0249 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:27:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:37:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:40:0x0104 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0106  */
    /* JADX WARN: Code duplicated, block: B:42:0x0108  */
    /* JADX WARN: Code duplicated, block: B:44:0x010c  */
    /* JADX WARN: Code duplicated, block: B:47:0x011f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:49:0x0123  */
    /* JADX WARN: Code duplicated, block: B:53:0x0134  */
    /* JADX WARN: Code duplicated, block: B:54:0x0147  */
    /* JADX WARN: Code duplicated, block: B:56:0x014d  */
    /* JADX WARN: Code duplicated, block: B:58:0x015d  */
    /* JADX WARN: Code duplicated, block: B:63:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:66:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:67:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:71:0x01ee A[LOOP:1: B:69:0x01e8->B:71:0x01ee, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:74:0x0202  */
    /* JADX WARN: Code duplicated, block: B:75:0x0207  */
    /* JADX WARN: Code duplicated, block: B:79:0x0234  */
    /* JADX WARN: Code duplicated, block: B:82:0x0240  */
    /* JADX WARN: Code duplicated, block: B:85:0x024f  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code duplicated, block: B:92:0x0266  */
    /* JADX WARN: Code duplicated, block: B:94:0x0269  */
    /* JADX WARN: Code duplicated, block: B:98:0x0273  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r2v21, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v14, types: [com.hwpo_training_app.leaderboards.details.list.data.LeaderboardAdditionalValueRepositoryImpl] */
    /* JADX WARN: Type inference failed for: r7v3, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v15 */
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
    public final Object b(int i, TopValueKind topValueKind, boolean z, u02 u02Var) throws Throwable {
        LeaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$1 leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$1;
        int i2;
        TopValueKind topValueKind2;
        boolean z2;
        LeaderboardDetailsFiltersModel leaderboardDetailsFiltersModel;
        Integer numK;
        Serializable serializableA;
        Integer num;
        int iOrdinal;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        LinkedHashSet linkedHashSet;
        String[] strArr;
        v72 v72Var;
        LeaderboardDetailsListStorage leaderboardDetailsListStorage;
        int i3;
        TopValueKind topValueKind3;
        boolean z7;
        boolean z8;
        Object objD;
        TopValueKind topValueKind4;
        int i4;
        PagingPaginationNetworkEntity pagingPaginationNetworkEntity;
        int i5;
        int i6;
        gl8 gl8Var;
        ?? arrayList;
        Iterator it;
        LeaderboardTopValueNetworkEntity leaderboardTopValueNetworkEntity;
        LeaderboardTopValueModel leaderboardTopValueModelE;
        Boolean bool;
        boolean zIsEmpty;
        Object objM;
        boolean z9;
        boolean z10;
        gl8 gl8Var2;
        LeaderboardTopValueModel leaderboardTopValueModel;
        Boolean bool2;
        TopValueKind topValueKind5;
        List list;
        ArrayList arrayList2;
        ?? r8;
        boolean z11;
        Object objA;
        Object obj;
        ?? r0;
        int i7;
        LeaderboardTopValueModel leaderboardTopValueModel2;
        TopValueKind topValueKind6;
        LeaderboardTopValueModel leaderboardTopValueModel3;
        int i8;
        LeaderboardTopValueModel leaderboardTopValueModel4;
        List list2;
        if (u02Var instanceof LeaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$1) {
            leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$1 = (LeaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$1) u02Var;
            int i9 = leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$1.G;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$1.G = i9 - Integer.MIN_VALUE;
            } else {
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$1 = new LeaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$1(this, u02Var);
            }
        } else {
            leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$1 = new LeaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$1(this, u02Var);
        }
        LeaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$1 leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2 = leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$1;
        Object objK = leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.E;
        int i10 = leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.G;
        LeaderboardDetailsListStorage leaderboardDetailsListStorage2 = this.c;
        v72 v72Var2 = v72.t;
        switch (i10) {
            case 0:
                dv8.b(objK);
                li8 li8VarA = this.d.a();
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.v = topValueKind;
                i2 = i;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.t = i2;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.C = z;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.G = 1;
                objK = yk2.k(li8VarA, leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2);
                if (objK != v72Var2) {
                    topValueKind2 = topValueKind;
                    z2 = z;
                    leaderboardDetailsFiltersModel = (LeaderboardDetailsFiltersModel) objK;
                    if (z2) {
                        numK = null;
                    } else {
                        numK = leaderboardDetailsListStorage2.k(topValueKind2);
                    }
                    if (numK != null && numK.intValue() == Integer.MIN_VALUE) {
                        return g2b.a;
                    }
                    leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.v = topValueKind2;
                    leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.w = leaderboardDetailsFiltersModel;
                    leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.x = numK;
                    leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.t = i2;
                    leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.C = z2;
                    leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.G = 2;
                    leaderboardDetailsFiltersModel.getClass();
                    serializableA = HasGymFilter.a(leaderboardDetailsFiltersModel, this.e, leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2);
                    if (serializableA != v72Var2) {
                        num = numK;
                        objK = serializableA;
                        js7 js7Var = (js7) objK;
                        Integer num2 = (Integer) js7Var.t;
                        String str = (String) js7Var.u;
                        iOrdinal = topValueKind2.ordinal();
                        if (iOrdinal == 0) {
                            z3 = false;
                        } else {
                            if (iOrdinal != 1) {
                                u.b();
                                return null;
                            }
                            z3 = true;
                        }
                        Integer num3 = leaderboardDetailsFiltersModel.d;
                        Integer num4 = leaderboardDetailsFiltersModel.e;
                        Boolean bool3 = leaderboardDetailsFiltersModel.g;
                        z4 = leaderboardDetailsFiltersModel.c;
                        z5 = leaderboardDetailsFiltersModel.b;
                        z6 = leaderboardDetailsFiltersModel.a;
                        if (!z6 && z5 && z4) {
                            z3 = z3;
                            bool3 = bool3;
                            strArr = null;
                        } else {
                            linkedHashSet = new LinkedHashSet();
                            if (z6) {
                                String lowerCase = "MALE".toLowerCase(Locale.ROOT);
                                lowerCase.getClass();
                                linkedHashSet.add(lowerCase);
                            }
                            if (z5) {
                                String lowerCase2 = "FEMALE".toLowerCase(Locale.ROOT);
                                lowerCase2.getClass();
                                linkedHashSet.add(lowerCase2);
                            }
                            if (z4) {
                                String lowerCase3 = "OTHER".toLowerCase(Locale.ROOT);
                                lowerCase3.getClass();
                                linkedHashSet.add(lowerCase3);
                            }
                            strArr = (String[]) linkedHashSet.toArray(new String[0]);
                        }
                        String str2 = leaderboardDetailsFiltersModel.f;
                        Integer num5 = new Integer(10);
                        leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.v = topValueKind2;
                        leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.w = null;
                        leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.x = null;
                        leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.t = i2;
                        leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.C = z2;
                        leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.G = 3;
                        String[] strArr2 = strArr;
                        v72Var = v72Var2;
                        leaderboardDetailsListStorage = leaderboardDetailsListStorage2;
                        i3 = i2;
                        topValueKind3 = topValueKind2;
                        z7 = false;
                        z8 = true;
                        objD = this.a.d(i3, null, strArr2, z3, str2, num3, num4, bool3, num2, str, num, num5, leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2);
                        leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2 = leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2;
                        if (objD == v72Var) {
                            return v72Var;
                        }
                        topValueKind4 = topValueKind3;
                        i4 = i3;
                        AthletesListResponse athletesListResponse = (AthletesListResponse) objD;
                        pagingPaginationNetworkEntity = athletesListResponse.d;
                        i5 = pagingPaginationNetworkEntity.c;
                        if (i5 < pagingPaginationNetworkEntity.b) {
                            i6 = i5 + 1;
                        } else {
                            i6 = Integer.MIN_VALUE;
                        }
                        leaderboardDetailsListStorage.l(topValueKind4, Integer.valueOf(i6));
                        gl8Var = new gl8();
                        List<LeaderboardTopValueNetworkEntity> list3 = athletesListResponse.a;
                        arrayList = new ArrayList(ph1.n(list3, 10));
                        it = list3.iterator();
                        while (it.hasNext()) {
                            arrayList.add(DomainEntitiesMapperKt.e((LeaderboardTopValueNetworkEntity) it.next()));
                        }
                        gl8Var.t = arrayList;
                        leaderboardTopValueNetworkEntity = athletesListResponse.b;
                        if (leaderboardTopValueNetworkEntity != null) {
                            leaderboardTopValueModelE = DomainEntitiesMapperKt.e(leaderboardTopValueNetworkEntity);
                        } else {
                            leaderboardTopValueModelE = null;
                        }
                        bool = athletesListResponse.c;
                        zIsEmpty = ((List) gl8Var.t).isEmpty();
                        a0a a0aVarM = leaderboardDetailsListStorage.m();
                        leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.v = topValueKind4;
                        leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.w = null;
                        leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.x = null;
                        leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.y = gl8Var;
                        leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.z = leaderboardTopValueModelE;
                        leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.A = bool;
                        leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.t = i4;
                        leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.C = z2;
                        leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.D = zIsEmpty;
                        leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.G = 4;
                        objM = yk2.m(a0aVarM, leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2);
                        if (objM == v72Var) {
                            return v72Var;
                        }
                        z9 = z2;
                        z10 = zIsEmpty;
                        gl8Var2 = gl8Var;
                        leaderboardTopValueModel = leaderboardTopValueModelE;
                        bool2 = bool;
                        topValueKind5 = topValueKind4;
                        list = (List) objM;
                        if (list != null) {
                            arrayList2 = new ArrayList();
                            for (Object obj2 : list) {
                                leaderboardTopValueModel3 = (LeaderboardTopValueModel) obj2;
                                if (leaderboardTopValueModel3.i != topValueKind5 && (-3 > (i8 = leaderboardTopValueModel3.a) || i8 >= 0)) {
                                    arrayList2.add(obj2);
                                }
                            }
                        } else {
                            arrayList2 = null;
                        }
                        if (arrayList2 != null || arrayList2.isEmpty()) {
                            r8 = z8;
                        } else {
                            r8 = z7;
                        }
                        leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.v = topValueKind5;
                        leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.w = null;
                        leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.x = null;
                        leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.y = gl8Var2;
                        leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.z = leaderboardTopValueModel;
                        leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.A = null;
                        leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.t = i4;
                        leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.C = z9;
                        leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.D = z10;
                        leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.u = r8;
                        leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.G = 5;
                        z11 = z10;
                        objA = this.b.a(bool2, z9, z11, r8, topValueKind5, leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2);
                        if (objA == v72Var) {
                            return v72Var;
                        }
                        obj = objA;
                        r0 = r8;
                        i7 = i4;
                        leaderboardTopValueModel2 = leaderboardTopValueModel;
                        topValueKind6 = topValueKind5;
                        leaderboardTopValueModel4 = (LeaderboardTopValueModel) obj;
                        if (leaderboardTopValueModel4 != null) {
                            gl8Var2.t = th1.K((Collection) gl8Var2.t, ws0.h(leaderboardTopValueModel4));
                        }
                        list2 = (List) gl8Var2.t;
                        leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.v = null;
                        leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.w = null;
                        leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.x = null;
                        leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.y = null;
                        leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.z = null;
                        leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.A = null;
                        leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.B = leaderboardDetailsListStorage;
                        leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.t = i7;
                        leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.C = z9;
                        leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.D = z11;
                        leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.u = r0;
                        if (z9) {
                            leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.G = 6;
                            if (leaderboardDetailsListStorage.a(topValueKind6, list2, leaderboardTopValueModel2) == v72Var) {
                                return v72Var;
                            }
                        } else {
                            leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.G = 7;
                            if (leaderboardDetailsListStorage.i(list2, leaderboardTopValueModel2) == v72Var) {
                                return v72Var;
                            }
                        }
                        return g2b.a;
                    }
                }
                return v72Var2;
            case 1:
                z2 = leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.C;
                i2 = leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.t;
                topValueKind2 = leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.v;
                dv8.b(objK);
                leaderboardDetailsFiltersModel = (LeaderboardDetailsFiltersModel) objK;
                if (z2) {
                    numK = leaderboardDetailsListStorage2.k(topValueKind2);
                } else {
                    numK = null;
                }
                if (numK != null) {
                    return g2b.a;
                }
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.v = topValueKind2;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.w = leaderboardDetailsFiltersModel;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.x = numK;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.t = i2;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.C = z2;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.G = 2;
                leaderboardDetailsFiltersModel.getClass();
                serializableA = HasGymFilter.a(leaderboardDetailsFiltersModel, this.e, leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2);
                if (serializableA != v72Var2) {
                    num = numK;
                    objK = serializableA;
                    js7 js7Var2 = (js7) objK;
                    Integer num6 = (Integer) js7Var2.t;
                    String str3 = (String) js7Var2.u;
                    iOrdinal = topValueKind2.ordinal();
                    if (iOrdinal == 0) {
                        z3 = false;
                    } else {
                        if (iOrdinal != 1) {
                            u.b();
                            return null;
                        }
                        z3 = true;
                    }
                    Integer num7 = leaderboardDetailsFiltersModel.d;
                    Integer num8 = leaderboardDetailsFiltersModel.e;
                    Boolean bool4 = leaderboardDetailsFiltersModel.g;
                    z4 = leaderboardDetailsFiltersModel.c;
                    z5 = leaderboardDetailsFiltersModel.b;
                    z6 = leaderboardDetailsFiltersModel.a;
                    if (!z6) {
                        linkedHashSet = new LinkedHashSet();
                        if (z6) {
                            String lowerCase4 = "MALE".toLowerCase(Locale.ROOT);
                            lowerCase4.getClass();
                            linkedHashSet.add(lowerCase4);
                        }
                        if (z5) {
                            String lowerCase5 = "FEMALE".toLowerCase(Locale.ROOT);
                            lowerCase5.getClass();
                            linkedHashSet.add(lowerCase5);
                        }
                        if (z4) {
                            String lowerCase6 = "OTHER".toLowerCase(Locale.ROOT);
                            lowerCase6.getClass();
                            linkedHashSet.add(lowerCase6);
                        }
                        strArr = (String[]) linkedHashSet.toArray(new String[0]);
                    } else {
                        linkedHashSet = new LinkedHashSet();
                        if (z6) {
                            String lowerCase7 = "MALE".toLowerCase(Locale.ROOT);
                            lowerCase7.getClass();
                            linkedHashSet.add(lowerCase7);
                        }
                        if (z5) {
                            String lowerCase8 = "FEMALE".toLowerCase(Locale.ROOT);
                            lowerCase8.getClass();
                            linkedHashSet.add(lowerCase8);
                        }
                        if (z4) {
                            String lowerCase9 = "OTHER".toLowerCase(Locale.ROOT);
                            lowerCase9.getClass();
                            linkedHashSet.add(lowerCase9);
                        }
                        strArr = (String[]) linkedHashSet.toArray(new String[0]);
                    }
                    String str4 = leaderboardDetailsFiltersModel.f;
                    Integer num9 = new Integer(10);
                    leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.v = topValueKind2;
                    leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.w = null;
                    leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.x = null;
                    leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.t = i2;
                    leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.C = z2;
                    leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.G = 3;
                    String[] strArr3 = strArr;
                    v72Var = v72Var2;
                    leaderboardDetailsListStorage = leaderboardDetailsListStorage2;
                    i3 = i2;
                    topValueKind3 = topValueKind2;
                    z7 = false;
                    z8 = true;
                    objD = this.a.d(i3, null, strArr3, z3, str4, num7, num8, bool4, num6, str3, num, num9, leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2);
                    leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2 = leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2;
                    if (objD == v72Var) {
                        return v72Var;
                    }
                    topValueKind4 = topValueKind3;
                    i4 = i3;
                    AthletesListResponse athletesListResponse2 = (AthletesListResponse) objD;
                    pagingPaginationNetworkEntity = athletesListResponse2.d;
                    i5 = pagingPaginationNetworkEntity.c;
                    if (i5 < pagingPaginationNetworkEntity.b) {
                        i6 = i5 + 1;
                    } else {
                        i6 = Integer.MIN_VALUE;
                    }
                    leaderboardDetailsListStorage.l(topValueKind4, Integer.valueOf(i6));
                    gl8Var = new gl8();
                    List<LeaderboardTopValueNetworkEntity> list4 = athletesListResponse2.a;
                    arrayList = new ArrayList(ph1.n(list4, 10));
                    it = list4.iterator();
                    while (it.hasNext()) {
                        arrayList.add(DomainEntitiesMapperKt.e((LeaderboardTopValueNetworkEntity) it.next()));
                    }
                    gl8Var.t = arrayList;
                    leaderboardTopValueNetworkEntity = athletesListResponse2.b;
                    if (leaderboardTopValueNetworkEntity != null) {
                        leaderboardTopValueModelE = DomainEntitiesMapperKt.e(leaderboardTopValueNetworkEntity);
                    } else {
                        leaderboardTopValueModelE = null;
                    }
                    bool = athletesListResponse2.c;
                    zIsEmpty = ((List) gl8Var.t).isEmpty();
                    a0a a0aVarM2 = leaderboardDetailsListStorage.m();
                    leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.v = topValueKind4;
                    leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.w = null;
                    leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.x = null;
                    leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.y = gl8Var;
                    leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.z = leaderboardTopValueModelE;
                    leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.A = bool;
                    leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.t = i4;
                    leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.C = z2;
                    leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.D = zIsEmpty;
                    leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.G = 4;
                    objM = yk2.m(a0aVarM2, leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2);
                    if (objM == v72Var) {
                        return v72Var;
                    }
                    z9 = z2;
                    z10 = zIsEmpty;
                    gl8Var2 = gl8Var;
                    leaderboardTopValueModel = leaderboardTopValueModelE;
                    bool2 = bool;
                    topValueKind5 = topValueKind4;
                    list = (List) objM;
                    if (list != null) {
                        arrayList2 = new ArrayList();
                        while (r4.hasNext()) {
                            leaderboardTopValueModel3 = (LeaderboardTopValueModel) obj2;
                            if (leaderboardTopValueModel3.i != topValueKind5) {
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                    if (arrayList2 != null) {
                        r8 = z8;
                    } else {
                        r8 = z8;
                    }
                    leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.v = topValueKind5;
                    leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.w = null;
                    leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.x = null;
                    leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.y = gl8Var2;
                    leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.z = leaderboardTopValueModel;
                    leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.A = null;
                    leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.t = i4;
                    leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.C = z9;
                    leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.D = z10;
                    leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.u = r8;
                    leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.G = 5;
                    z11 = z10;
                    objA = this.b.a(bool2, z9, z11, r8, topValueKind5, leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2);
                    if (objA == v72Var) {
                        return v72Var;
                    }
                    obj = objA;
                    r0 = r8;
                    i7 = i4;
                    leaderboardTopValueModel2 = leaderboardTopValueModel;
                    topValueKind6 = topValueKind5;
                    leaderboardTopValueModel4 = (LeaderboardTopValueModel) obj;
                    if (leaderboardTopValueModel4 != null) {
                        gl8Var2.t = th1.K((Collection) gl8Var2.t, ws0.h(leaderboardTopValueModel4));
                    }
                    list2 = (List) gl8Var2.t;
                    leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.v = null;
                    leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.w = null;
                    leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.x = null;
                    leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.y = null;
                    leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.z = null;
                    leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.A = null;
                    leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.B = leaderboardDetailsListStorage;
                    leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.t = i7;
                    leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.C = z9;
                    leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.D = z11;
                    leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.u = r0;
                    if (z9) {
                        leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.G = 6;
                        if (leaderboardDetailsListStorage.a(topValueKind6, list2, leaderboardTopValueModel2) == v72Var) {
                            return v72Var;
                        }
                    } else {
                        leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.G = 7;
                        if (leaderboardDetailsListStorage.i(list2, leaderboardTopValueModel2) == v72Var) {
                            return v72Var;
                        }
                    }
                    return g2b.a;
                }
                return v72Var2;
            case 2:
                z2 = leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.C;
                i2 = leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.t;
                Integer num10 = leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.x;
                leaderboardDetailsFiltersModel = leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.w;
                TopValueKind topValueKind7 = leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.v;
                dv8.b(objK);
                num = num10;
                topValueKind2 = topValueKind7;
                js7 js7Var3 = (js7) objK;
                Integer num11 = (Integer) js7Var3.t;
                String str5 = (String) js7Var3.u;
                iOrdinal = topValueKind2.ordinal();
                if (iOrdinal == 0) {
                    z3 = false;
                } else {
                    if (iOrdinal != 1) {
                        u.b();
                        return null;
                    }
                    z3 = true;
                }
                Integer num12 = leaderboardDetailsFiltersModel.d;
                Integer num13 = leaderboardDetailsFiltersModel.e;
                Boolean bool5 = leaderboardDetailsFiltersModel.g;
                z4 = leaderboardDetailsFiltersModel.c;
                z5 = leaderboardDetailsFiltersModel.b;
                z6 = leaderboardDetailsFiltersModel.a;
                if (!z6) {
                    linkedHashSet = new LinkedHashSet();
                    if (z6) {
                        String lowerCase10 = "MALE".toLowerCase(Locale.ROOT);
                        lowerCase10.getClass();
                        linkedHashSet.add(lowerCase10);
                    }
                    if (z5) {
                        String lowerCase11 = "FEMALE".toLowerCase(Locale.ROOT);
                        lowerCase11.getClass();
                        linkedHashSet.add(lowerCase11);
                    }
                    if (z4) {
                        String lowerCase12 = "OTHER".toLowerCase(Locale.ROOT);
                        lowerCase12.getClass();
                        linkedHashSet.add(lowerCase12);
                    }
                    strArr = (String[]) linkedHashSet.toArray(new String[0]);
                } else {
                    linkedHashSet = new LinkedHashSet();
                    if (z6) {
                        String lowerCase13 = "MALE".toLowerCase(Locale.ROOT);
                        lowerCase13.getClass();
                        linkedHashSet.add(lowerCase13);
                    }
                    if (z5) {
                        String lowerCase14 = "FEMALE".toLowerCase(Locale.ROOT);
                        lowerCase14.getClass();
                        linkedHashSet.add(lowerCase14);
                    }
                    if (z4) {
                        String lowerCase15 = "OTHER".toLowerCase(Locale.ROOT);
                        lowerCase15.getClass();
                        linkedHashSet.add(lowerCase15);
                    }
                    strArr = (String[]) linkedHashSet.toArray(new String[0]);
                }
                String str6 = leaderboardDetailsFiltersModel.f;
                Integer num14 = new Integer(10);
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.v = topValueKind2;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.w = null;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.x = null;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.t = i2;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.C = z2;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.G = 3;
                String[] strArr4 = strArr;
                v72Var = v72Var2;
                leaderboardDetailsListStorage = leaderboardDetailsListStorage2;
                i3 = i2;
                topValueKind3 = topValueKind2;
                z7 = false;
                z8 = true;
                objD = this.a.d(i3, null, strArr4, z3, str6, num12, num13, bool5, num11, str5, num, num14, leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2);
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2 = leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2;
                if (objD == v72Var) {
                    return v72Var;
                }
                topValueKind4 = topValueKind3;
                i4 = i3;
                AthletesListResponse athletesListResponse3 = (AthletesListResponse) objD;
                pagingPaginationNetworkEntity = athletesListResponse3.d;
                i5 = pagingPaginationNetworkEntity.c;
                if (i5 < pagingPaginationNetworkEntity.b) {
                    i6 = i5 + 1;
                } else {
                    i6 = Integer.MIN_VALUE;
                }
                leaderboardDetailsListStorage.l(topValueKind4, Integer.valueOf(i6));
                gl8Var = new gl8();
                List<LeaderboardTopValueNetworkEntity> list5 = athletesListResponse3.a;
                arrayList = new ArrayList(ph1.n(list5, 10));
                it = list5.iterator();
                while (it.hasNext()) {
                    arrayList.add(DomainEntitiesMapperKt.e((LeaderboardTopValueNetworkEntity) it.next()));
                }
                gl8Var.t = arrayList;
                leaderboardTopValueNetworkEntity = athletesListResponse3.b;
                if (leaderboardTopValueNetworkEntity != null) {
                    leaderboardTopValueModelE = DomainEntitiesMapperKt.e(leaderboardTopValueNetworkEntity);
                } else {
                    leaderboardTopValueModelE = null;
                }
                bool = athletesListResponse3.c;
                zIsEmpty = ((List) gl8Var.t).isEmpty();
                a0a a0aVarM3 = leaderboardDetailsListStorage.m();
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.v = topValueKind4;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.w = null;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.x = null;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.y = gl8Var;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.z = leaderboardTopValueModelE;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.A = bool;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.t = i4;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.C = z2;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.D = zIsEmpty;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.G = 4;
                objM = yk2.m(a0aVarM3, leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2);
                if (objM == v72Var) {
                    return v72Var;
                }
                z9 = z2;
                z10 = zIsEmpty;
                gl8Var2 = gl8Var;
                leaderboardTopValueModel = leaderboardTopValueModelE;
                bool2 = bool;
                topValueKind5 = topValueKind4;
                list = (List) objM;
                if (list != null) {
                    arrayList2 = new ArrayList();
                    while (r4.hasNext()) {
                        leaderboardTopValueModel3 = (LeaderboardTopValueModel) obj2;
                        if (leaderboardTopValueModel3.i != topValueKind5) {
                        }
                    }
                } else {
                    arrayList2 = null;
                }
                if (arrayList2 != null) {
                    r8 = z8;
                } else {
                    r8 = z8;
                }
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.v = topValueKind5;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.w = null;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.x = null;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.y = gl8Var2;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.z = leaderboardTopValueModel;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.A = null;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.t = i4;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.C = z9;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.D = z10;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.u = r8;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.G = 5;
                z11 = z10;
                objA = this.b.a(bool2, z9, z11, r8, topValueKind5, leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2);
                if (objA == v72Var) {
                    return v72Var;
                }
                obj = objA;
                r0 = r8;
                i7 = i4;
                leaderboardTopValueModel2 = leaderboardTopValueModel;
                topValueKind6 = topValueKind5;
                leaderboardTopValueModel4 = (LeaderboardTopValueModel) obj;
                if (leaderboardTopValueModel4 != null) {
                    gl8Var2.t = th1.K((Collection) gl8Var2.t, ws0.h(leaderboardTopValueModel4));
                }
                list2 = (List) gl8Var2.t;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.v = null;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.w = null;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.x = null;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.y = null;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.z = null;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.A = null;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.B = leaderboardDetailsListStorage;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.t = i7;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.C = z9;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.D = z11;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.u = r0;
                if (z9) {
                    leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.G = 6;
                    if (leaderboardDetailsListStorage.a(topValueKind6, list2, leaderboardTopValueModel2) == v72Var) {
                        return v72Var;
                    }
                } else {
                    leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.G = 7;
                    if (leaderboardDetailsListStorage.i(list2, leaderboardTopValueModel2) == v72Var) {
                        return v72Var;
                    }
                }
                return g2b.a;
            case 3:
                z2 = leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.C;
                i4 = leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.t;
                TopValueKind topValueKind8 = leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.v;
                dv8.b(objK);
                objD = objK;
                leaderboardDetailsListStorage = leaderboardDetailsListStorage2;
                z8 = true;
                v72Var = v72Var2;
                topValueKind4 = topValueKind8;
                z7 = false;
                AthletesListResponse athletesListResponse4 = (AthletesListResponse) objD;
                pagingPaginationNetworkEntity = athletesListResponse4.d;
                i5 = pagingPaginationNetworkEntity.c;
                if (i5 < pagingPaginationNetworkEntity.b) {
                    i6 = i5 + 1;
                } else {
                    i6 = Integer.MIN_VALUE;
                }
                leaderboardDetailsListStorage.l(topValueKind4, Integer.valueOf(i6));
                gl8Var = new gl8();
                List<LeaderboardTopValueNetworkEntity> list6 = athletesListResponse4.a;
                arrayList = new ArrayList(ph1.n(list6, 10));
                it = list6.iterator();
                while (it.hasNext()) {
                    arrayList.add(DomainEntitiesMapperKt.e((LeaderboardTopValueNetworkEntity) it.next()));
                }
                gl8Var.t = arrayList;
                leaderboardTopValueNetworkEntity = athletesListResponse4.b;
                if (leaderboardTopValueNetworkEntity != null) {
                    leaderboardTopValueModelE = DomainEntitiesMapperKt.e(leaderboardTopValueNetworkEntity);
                } else {
                    leaderboardTopValueModelE = null;
                }
                bool = athletesListResponse4.c;
                zIsEmpty = ((List) gl8Var.t).isEmpty();
                a0a a0aVarM4 = leaderboardDetailsListStorage.m();
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.v = topValueKind4;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.w = null;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.x = null;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.y = gl8Var;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.z = leaderboardTopValueModelE;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.A = bool;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.t = i4;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.C = z2;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.D = zIsEmpty;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.G = 4;
                objM = yk2.m(a0aVarM4, leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2);
                if (objM == v72Var) {
                    return v72Var;
                }
                z9 = z2;
                z10 = zIsEmpty;
                gl8Var2 = gl8Var;
                leaderboardTopValueModel = leaderboardTopValueModelE;
                bool2 = bool;
                topValueKind5 = topValueKind4;
                list = (List) objM;
                if (list != null) {
                    arrayList2 = new ArrayList();
                    while (r4.hasNext()) {
                        leaderboardTopValueModel3 = (LeaderboardTopValueModel) obj2;
                        if (leaderboardTopValueModel3.i != topValueKind5) {
                        }
                    }
                } else {
                    arrayList2 = null;
                }
                if (arrayList2 != null) {
                    r8 = z8;
                } else {
                    r8 = z8;
                }
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.v = topValueKind5;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.w = null;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.x = null;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.y = gl8Var2;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.z = leaderboardTopValueModel;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.A = null;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.t = i4;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.C = z9;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.D = z10;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.u = r8;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.G = 5;
                z11 = z10;
                objA = this.b.a(bool2, z9, z11, r8, topValueKind5, leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2);
                if (objA == v72Var) {
                    return v72Var;
                }
                obj = objA;
                r0 = r8;
                i7 = i4;
                leaderboardTopValueModel2 = leaderboardTopValueModel;
                topValueKind6 = topValueKind5;
                leaderboardTopValueModel4 = (LeaderboardTopValueModel) obj;
                if (leaderboardTopValueModel4 != null) {
                    gl8Var2.t = th1.K((Collection) gl8Var2.t, ws0.h(leaderboardTopValueModel4));
                }
                list2 = (List) gl8Var2.t;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.v = null;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.w = null;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.x = null;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.y = null;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.z = null;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.A = null;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.B = leaderboardDetailsListStorage;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.t = i7;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.C = z9;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.D = z11;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.u = r0;
                if (z9) {
                    leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.G = 6;
                    if (leaderboardDetailsListStorage.a(topValueKind6, list2, leaderboardTopValueModel2) == v72Var) {
                        return v72Var;
                    }
                } else {
                    leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.G = 7;
                    if (leaderboardDetailsListStorage.i(list2, leaderboardTopValueModel2) == v72Var) {
                        return v72Var;
                    }
                }
                return g2b.a;
            case 4:
                z10 = leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.D;
                boolean z12 = leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.C;
                int i11 = leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.t;
                Boolean bool6 = leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.A;
                leaderboardTopValueModel = leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.z;
                gl8Var2 = leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.y;
                topValueKind4 = leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.v;
                dv8.b(objK);
                z9 = z12;
                leaderboardDetailsListStorage = leaderboardDetailsListStorage2;
                z8 = true;
                bool2 = bool6;
                z7 = false;
                objM = objK;
                i4 = i11;
                v72Var = v72Var2;
                topValueKind5 = topValueKind4;
                list = (List) objM;
                if (list != null) {
                    arrayList2 = new ArrayList();
                    while (r4.hasNext()) {
                        leaderboardTopValueModel3 = (LeaderboardTopValueModel) obj2;
                        if (leaderboardTopValueModel3.i != topValueKind5) {
                        }
                    }
                } else {
                    arrayList2 = null;
                }
                if (arrayList2 != null) {
                    r8 = z8;
                } else {
                    r8 = z8;
                }
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.v = topValueKind5;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.w = null;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.x = null;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.y = gl8Var2;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.z = leaderboardTopValueModel;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.A = null;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.t = i4;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.C = z9;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.D = z10;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.u = r8;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.G = 5;
                z11 = z10;
                objA = this.b.a(bool2, z9, z11, r8, topValueKind5, leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2);
                if (objA == v72Var) {
                    return v72Var;
                }
                obj = objA;
                r0 = r8;
                i7 = i4;
                leaderboardTopValueModel2 = leaderboardTopValueModel;
                topValueKind6 = topValueKind5;
                leaderboardTopValueModel4 = (LeaderboardTopValueModel) obj;
                if (leaderboardTopValueModel4 != null) {
                    gl8Var2.t = th1.K((Collection) gl8Var2.t, ws0.h(leaderboardTopValueModel4));
                }
                list2 = (List) gl8Var2.t;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.v = null;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.w = null;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.x = null;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.y = null;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.z = null;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.A = null;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.B = leaderboardDetailsListStorage;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.t = i7;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.C = z9;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.D = z11;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.u = r0;
                if (z9) {
                    leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.G = 6;
                    if (leaderboardDetailsListStorage.a(topValueKind6, list2, leaderboardTopValueModel2) == v72Var) {
                        return v72Var;
                    }
                } else {
                    leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.G = 7;
                    if (leaderboardDetailsListStorage.i(list2, leaderboardTopValueModel2) == v72Var) {
                        return v72Var;
                    }
                }
                return g2b.a;
            case 5:
                int i12 = leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.u;
                boolean z13 = leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.D;
                boolean z14 = leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.C;
                i7 = leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.t;
                leaderboardTopValueModel2 = leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.z;
                gl8 gl8Var3 = leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.y;
                topValueKind6 = leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.v;
                dv8.b(objK);
                z9 = z14;
                leaderboardDetailsListStorage = leaderboardDetailsListStorage2;
                gl8Var2 = gl8Var3;
                z11 = z13;
                obj = objK;
                v72Var = v72Var2;
                r0 = i12;
                leaderboardTopValueModel4 = (LeaderboardTopValueModel) obj;
                if (leaderboardTopValueModel4 != null) {
                    gl8Var2.t = th1.K((Collection) gl8Var2.t, ws0.h(leaderboardTopValueModel4));
                }
                list2 = (List) gl8Var2.t;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.v = null;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.w = null;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.x = null;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.y = null;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.z = null;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.A = null;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.B = leaderboardDetailsListStorage;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.t = i7;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.C = z9;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.D = z11;
                leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.u = r0;
                if (z9) {
                    leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.G = 6;
                    if (leaderboardDetailsListStorage.a(topValueKind6, list2, leaderboardTopValueModel2) == v72Var) {
                        return v72Var;
                    }
                } else {
                    leaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$2.G = 7;
                    if (leaderboardDetailsListStorage.i(list2, leaderboardTopValueModel2) == v72Var) {
                        return v72Var;
                    }
                }
                return g2b.a;
            case 6:
            case 7:
                dv8.b(objK);
                return g2b.a;
            default:
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        if (r5.c.d(r6, true) == r4) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(int r6, defpackage.u02 r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.hwpo_training_app.leaderboards.details.list.data.LeaderboardDetailsListRepositoryImpl$likeResult$1
            if (r0 == 0) goto L13
            r0 = r7
            com.hwpo_training_app.leaderboards.details.list.data.LeaderboardDetailsListRepositoryImpl$likeResult$1 r0 = (com.hwpo_training_app.leaderboards.details.list.data.LeaderboardDetailsListRepositoryImpl$likeResult$1) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            com.hwpo_training_app.leaderboards.details.list.data.LeaderboardDetailsListRepositoryImpl$likeResult$1 r0 = new com.hwpo_training_app.leaderboards.details.list.data.LeaderboardDetailsListRepositoryImpl$likeResult$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            int r1 = r0.w
            r2 = 2
            r3 = 1
            v72 r4 = defpackage.v72.t
            if (r1 == 0) goto L37
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2a
            defpackage.dv8.b(r7)
            goto L56
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r5)
            r5 = 0
            return r5
        L31:
            int r6 = r0.t
            defpackage.dv8.b(r7)
            goto L49
        L37:
            defpackage.dv8.b(r7)
            r0.t = r6
            r0.w = r3
            com.hwpo_training_app.leaderboards.details.list.data.api.LeaderboardDetailsListApi r7 = r5.a
            java.lang.String r1 = "score/value"
            java.lang.Object r7 = r7.b(r6, r1, r0)
            if (r7 != r4) goto L49
            goto L55
        L49:
            r0.t = r6
            r0.w = r2
            com.hwpo_training_app.leaderboards.details.list.domain.LeaderboardDetailsListStorage r5 = r5.c
            g2b r5 = r5.d(r6, r3)
            if (r5 != r4) goto L56
        L55:
            return r4
        L56:
            g2b r5 = defpackage.g2b.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hwpo_training_app.leaderboards.details.list.data.LeaderboardDetailsListRepositoryImpl.c(int, u02):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
    
        if (r5.c.d(r6, false) == r4) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(int r6, defpackage.u02 r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.hwpo_training_app.leaderboards.details.list.data.LeaderboardDetailsListRepositoryImpl$unlikeResult$1
            if (r0 == 0) goto L13
            r0 = r7
            com.hwpo_training_app.leaderboards.details.list.data.LeaderboardDetailsListRepositoryImpl$unlikeResult$1 r0 = (com.hwpo_training_app.leaderboards.details.list.data.LeaderboardDetailsListRepositoryImpl$unlikeResult$1) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            com.hwpo_training_app.leaderboards.details.list.data.LeaderboardDetailsListRepositoryImpl$unlikeResult$1 r0 = new com.hwpo_training_app.leaderboards.details.list.data.LeaderboardDetailsListRepositoryImpl$unlikeResult$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            int r1 = r0.w
            r2 = 2
            r3 = 1
            v72 r4 = defpackage.v72.t
            if (r1 == 0) goto L37
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2a
            defpackage.dv8.b(r7)
            goto L57
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r5)
            r5 = 0
            return r5
        L31:
            int r6 = r0.t
            defpackage.dv8.b(r7)
            goto L49
        L37:
            defpackage.dv8.b(r7)
            r0.t = r6
            r0.w = r3
            com.hwpo_training_app.leaderboards.details.list.data.api.LeaderboardDetailsListApi r7 = r5.a
            java.lang.String r1 = "score/value"
            java.lang.Object r7 = r7.c(r6, r1, r0)
            if (r7 != r4) goto L49
            goto L56
        L49:
            r0.t = r6
            r0.w = r2
            com.hwpo_training_app.leaderboards.details.list.domain.LeaderboardDetailsListStorage r5 = r5.c
            r7 = 0
            g2b r5 = r5.d(r6, r7)
            if (r5 != r4) goto L57
        L56:
            return r4
        L57:
            g2b r5 = defpackage.g2b.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hwpo_training_app.leaderboards.details.list.data.LeaderboardDetailsListRepositoryImpl.d(int, u02):java.lang.Object");
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
        }
    }
}

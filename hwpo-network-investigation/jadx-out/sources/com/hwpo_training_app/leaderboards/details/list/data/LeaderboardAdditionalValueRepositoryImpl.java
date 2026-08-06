package com.hwpo_training_app.leaderboards.details.list.data;

import com.hwpo_training_app.leaderboards.common.domain.entity.LeaderboardTopValueModel;
import com.hwpo_training_app.leaderboards.common.domain.entity.TopValueKind;
import com.hwpo_training_app.leaderboards.details.list.domain.LeaderboardAdditionalValueRepository;
import com.hwpo_training_app.leaderboards.details.list.domain.LeaderboardDetailsListStorage;
import defpackage.aa0;
import defpackage.dv8;
import defpackage.r54;
import defpackage.u02;
import defpackage.v72;
import defpackage.w5b;
import defpackage.yk2;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class LeaderboardAdditionalValueRepositoryImpl implements LeaderboardAdditionalValueRepository {
    public final LeaderboardDetailsListStorage a;
    public final w5b b;

    public LeaderboardAdditionalValueRepositoryImpl(LeaderboardDetailsListStorage leaderboardDetailsListStorage, w5b w5bVar) {
        leaderboardDetailsListStorage.getClass();
        w5bVar.getClass();
        this.a = leaderboardDetailsListStorage;
        this.b = w5bVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00af, code lost:
    
        if (r6 == r10) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b8, code lost:
    
        if (((java.lang.Boolean) r6).booleanValue() == false) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.Boolean r31, boolean r32, boolean r33, boolean r34, com.hwpo_training_app.leaderboards.common.domain.entity.TopValueKind r35, defpackage.u02 r36) {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hwpo_training_app.leaderboards.details.list.data.LeaderboardAdditionalValueRepositoryImpl.a(java.lang.Boolean, boolean, boolean, boolean, com.hwpo_training_app.leaderboards.common.domain.entity.TopValueKind, u02):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(r54 r54Var, TopValueKind topValueKind, u02 u02Var) throws Throwable {
        LeaderboardAdditionalValueRepositoryImpl$isMyEmptyValueStored$1 leaderboardAdditionalValueRepositoryImpl$isMyEmptyValueStored$1;
        if (u02Var instanceof LeaderboardAdditionalValueRepositoryImpl$isMyEmptyValueStored$1) {
            leaderboardAdditionalValueRepositoryImpl$isMyEmptyValueStored$1 = (LeaderboardAdditionalValueRepositoryImpl$isMyEmptyValueStored$1) u02Var;
            int i = leaderboardAdditionalValueRepositoryImpl$isMyEmptyValueStored$1.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                leaderboardAdditionalValueRepositoryImpl$isMyEmptyValueStored$1.w = i - Integer.MIN_VALUE;
            } else {
                leaderboardAdditionalValueRepositoryImpl$isMyEmptyValueStored$1 = new LeaderboardAdditionalValueRepositoryImpl$isMyEmptyValueStored$1(this, u02Var);
            }
        } else {
            leaderboardAdditionalValueRepositoryImpl$isMyEmptyValueStored$1 = new LeaderboardAdditionalValueRepositoryImpl$isMyEmptyValueStored$1(this, u02Var);
        }
        Object objM = leaderboardAdditionalValueRepositoryImpl$isMyEmptyValueStored$1.u;
        int i2 = leaderboardAdditionalValueRepositoryImpl$isMyEmptyValueStored$1.w;
        boolean z = true;
        if (i2 == 0) {
            dv8.b(objM);
            leaderboardAdditionalValueRepositoryImpl$isMyEmptyValueStored$1.t = topValueKind;
            leaderboardAdditionalValueRepositoryImpl$isMyEmptyValueStored$1.w = 1;
            objM = yk2.m(r54Var, leaderboardAdditionalValueRepositoryImpl$isMyEmptyValueStored$1);
            v72 v72Var = v72.t;
            if (objM == v72Var) {
                return v72Var;
            }
        } else {
            if (i2 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            topValueKind = leaderboardAdditionalValueRepositoryImpl$isMyEmptyValueStored$1.t;
            dv8.b(objM);
        }
        List<LeaderboardTopValueModel> list = (List) objM;
        if (list == null || list.isEmpty()) {
            z = false;
        } else {
            for (LeaderboardTopValueModel leaderboardTopValueModel : list) {
                if (leaderboardTopValueModel.a != -3 || leaderboardTopValueModel.i != topValueKind) {
                }
            }
            z = false;
        }
        return Boolean.valueOf(z);
    }
}

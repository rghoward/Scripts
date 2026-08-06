package com.hwpo_training_app.leaderboards.details.common.domain;

import com.hwpo_training_app.leaderboards.details.common.data.LeaderboardDetailsActionsRepositoryImpl;
import com.hwpo_training_app.leaderboards.details.common.domain.actions.LeaderboardDetailsAction;
import defpackage.aa0;
import defpackage.dv8;
import defpackage.g2b;
import defpackage.g5b;
import defpackage.u02;
import defpackage.v72;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class SendLeaderboardDetailsActionUseCase extends g5b<LeaderboardDetailsAction, g2b> {
    public final LeaderboardDetailsActionsRepositoryImpl a;

    public SendLeaderboardDetailsActionUseCase(LeaderboardDetailsActionsRepositoryImpl leaderboardDetailsActionsRepositoryImpl) {
        this.a = leaderboardDetailsActionsRepositoryImpl;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.g5b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object a(LeaderboardDetailsAction leaderboardDetailsAction, u02 u02Var) throws Throwable {
        SendLeaderboardDetailsActionUseCase$executeOnBackground$1 sendLeaderboardDetailsActionUseCase$executeOnBackground$1;
        if (u02Var instanceof SendLeaderboardDetailsActionUseCase$executeOnBackground$1) {
            sendLeaderboardDetailsActionUseCase$executeOnBackground$1 = (SendLeaderboardDetailsActionUseCase$executeOnBackground$1) u02Var;
            int i = sendLeaderboardDetailsActionUseCase$executeOnBackground$1.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                sendLeaderboardDetailsActionUseCase$executeOnBackground$1.v = i - Integer.MIN_VALUE;
            } else {
                sendLeaderboardDetailsActionUseCase$executeOnBackground$1 = new SendLeaderboardDetailsActionUseCase$executeOnBackground$1(this, u02Var);
            }
        } else {
            sendLeaderboardDetailsActionUseCase$executeOnBackground$1 = new SendLeaderboardDetailsActionUseCase$executeOnBackground$1(this, u02Var);
        }
        Object obj = sendLeaderboardDetailsActionUseCase$executeOnBackground$1.t;
        int i2 = sendLeaderboardDetailsActionUseCase$executeOnBackground$1.v;
        if (i2 == 0) {
            dv8.b(obj);
            sendLeaderboardDetailsActionUseCase$executeOnBackground$1.v = 1;
            Object objB = this.a.a.b(leaderboardDetailsAction, sendLeaderboardDetailsActionUseCase$executeOnBackground$1);
            v72 v72Var = v72.t;
            if (objB != v72Var) {
                objB = g2b.a;
            }
            if (objB == v72Var) {
                return v72Var;
            }
        } else {
            if (i2 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
        }
        return g2b.a;
    }
}

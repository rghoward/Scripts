package com.hwpo_training_app.core.data.model.schedule;

import com.hwpo_training_app.core.data.model.schedule.score.ProgramScoreNetworkEntity;
import defpackage.f93;
import defpackage.g93;
import defpackage.rd9;
import defpackage.vc8;
import defpackage.xj5;
import defpackage.yz8;
import kotlinx.serialization.KSerializer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@rd9
public final class SavePerformanceResponse implements f93<yz8> {
    public static final Companion Companion = new Companion();
    public final ProgramPerformanceNetworkEntity t;
    public final ProgramScoreNetworkEntity u;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public final KSerializer<SavePerformanceResponse> serializer() {
            return SavePerformanceResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SavePerformanceResponse(int i, ProgramPerformanceNetworkEntity programPerformanceNetworkEntity, ProgramScoreNetworkEntity programScoreNetworkEntity) {
        if ((i & 1) == 0) {
            this.t = null;
        } else {
            this.t = programPerformanceNetworkEntity;
        }
        if ((i & 2) == 0) {
            this.u = null;
        } else {
            this.u = programScoreNetworkEntity;
        }
    }

    @Override // defpackage.f93
    public final yz8 a() {
        ProgramPerformanceNetworkEntity programPerformanceNetworkEntity = this.t;
        vc8 vc8Var = programPerformanceNetworkEntity != null ? new vc8(programPerformanceNetworkEntity.t, programPerformanceNetworkEntity.u, g93.a(programPerformanceNetworkEntity.v)) : null;
        ProgramScoreNetworkEntity programScoreNetworkEntity = this.u;
        return new yz8(vc8Var, programScoreNetworkEntity != null ? programScoreNetworkEntity.a() : null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SavePerformanceResponse)) {
            return false;
        }
        SavePerformanceResponse savePerformanceResponse = (SavePerformanceResponse) obj;
        return xj5.a(this.t, savePerformanceResponse.t) && xj5.a(this.u, savePerformanceResponse.u);
    }

    public final int hashCode() {
        ProgramPerformanceNetworkEntity programPerformanceNetworkEntity = this.t;
        int iHashCode = (programPerformanceNetworkEntity == null ? 0 : programPerformanceNetworkEntity.hashCode()) * 31;
        ProgramScoreNetworkEntity programScoreNetworkEntity = this.u;
        return iHashCode + (programScoreNetworkEntity != null ? programScoreNetworkEntity.hashCode() : 0);
    }

    public final String toString() {
        return "SavePerformanceResponse(performance=" + this.t + ", score=" + this.u + ")";
    }

    public SavePerformanceResponse() {
        this.t = null;
        this.u = null;
    }
}

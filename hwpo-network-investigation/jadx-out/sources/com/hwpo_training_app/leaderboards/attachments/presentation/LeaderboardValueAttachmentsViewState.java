package com.hwpo_training_app.leaderboards.attachments.presentation;

import defpackage.el0;
import defpackage.hf3;
import defpackage.sk1;
import defpackage.vz7;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class LeaderboardValueAttachmentsViewState implements el0 {
    public static final Companion Companion = new Companion(0);
    public static final LeaderboardValueAttachmentsViewState d = new LeaderboardValueAttachmentsViewState(false, new vz7(0, false, false, null, null, null, 127), hf3.t);
    public final boolean a;
    public final vz7 b;
    public final List<sk1.a> c;

    public LeaderboardValueAttachmentsViewState(boolean z, vz7 vz7Var, List<sk1.a> list) {
        this.a = z;
        this.b = vz7Var;
        this.c = list;
    }

    public static LeaderboardValueAttachmentsViewState a(LeaderboardValueAttachmentsViewState leaderboardValueAttachmentsViewState, boolean z, vz7 vz7Var, List list, int i) {
        if ((i & 1) != 0) {
            z = leaderboardValueAttachmentsViewState.a;
        }
        if ((i & 2) != 0) {
            vz7Var = leaderboardValueAttachmentsViewState.b;
        }
        if ((i & 4) != 0) {
            list = leaderboardValueAttachmentsViewState.c;
        }
        leaderboardValueAttachmentsViewState.getClass();
        list.getClass();
        return new LeaderboardValueAttachmentsViewState(z, vz7Var, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeaderboardValueAttachmentsViewState)) {
            return false;
        }
        LeaderboardValueAttachmentsViewState leaderboardValueAttachmentsViewState = (LeaderboardValueAttachmentsViewState) obj;
        return this.a == leaderboardValueAttachmentsViewState.a && this.b.equals(leaderboardValueAttachmentsViewState.b) && this.c.equals(leaderboardValueAttachmentsViewState.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "LeaderboardValueAttachmentsViewState(isLoading=" + this.a + ", placeholderState=" + this.b + ", attachmentComments=" + this.c + ")";
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

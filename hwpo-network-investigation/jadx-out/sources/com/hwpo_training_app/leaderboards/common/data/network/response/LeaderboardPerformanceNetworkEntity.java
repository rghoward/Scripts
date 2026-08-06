package com.hwpo_training_app.leaderboards.common.data.network.response;

import com.hwpo_training_app.core.data.model.attachments.SectionAttachmentNetworkEntity;
import defpackage.e46;
import defpackage.hl3;
import defpackage.hv5;
import defpackage.il;
import defpackage.j26;
import defpackage.rd9;
import defpackage.ss5;
import defpackage.xj5;
import java.util.List;
import kotlinx.serialization.KSerializer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@rd9
public final class LeaderboardPerformanceNetworkEntity {
    public static final Companion Companion;
    public static final ss5<KSerializer<Object>>[] d;
    public final int a;
    public final String b;
    public final List<SectionAttachmentNetworkEntity> c;

    static {
        int i = 0;
        Companion = new Companion(i);
        d = new ss5[]{null, null, hv5.c(j26.t, new e46(i))};
    }

    public /* synthetic */ LeaderboardPerformanceNetworkEntity(int i, int i2, String str, List list) {
        if (3 != (i & 3)) {
            hl3.b(i, 3, LeaderboardPerformanceNetworkEntity$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = i2;
        this.b = str;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeaderboardPerformanceNetworkEntity)) {
            return false;
        }
        LeaderboardPerformanceNetworkEntity leaderboardPerformanceNetworkEntity = (LeaderboardPerformanceNetworkEntity) obj;
        return this.a == leaderboardPerformanceNetworkEntity.a && xj5.a(this.b, leaderboardPerformanceNetworkEntity.b) && xj5.a(this.c, leaderboardPerformanceNetworkEntity.c);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<SectionAttachmentNetworkEntity> list = this.c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbA = il.a("LeaderboardPerformanceNetworkEntity(id=", ", text=", this.b, ", attachments=", this.a);
        sbA.append(this.c);
        sbA.append(")");
        return sbA.toString();
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        public final KSerializer<LeaderboardPerformanceNetworkEntity> serializer() {
            return LeaderboardPerformanceNetworkEntity$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }
}

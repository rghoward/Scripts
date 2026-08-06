package com.hwpo_training_app.core.data.model.user;

import defpackage.av;
import defpackage.f93;
import defpackage.hl3;
import defpackage.il;
import defpackage.ps6;
import defpackage.rd9;
import defpackage.ru3;
import defpackage.ux1;
import defpackage.xj5;
import kotlinx.serialization.KSerializer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@rd9
public final class OpponentNetworkEntity implements f93<ps6> {
    public static final Companion Companion = new Companion();
    public final int t;
    public final String u;
    public final String v;
    public final String w;
    public final String x;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public final KSerializer<OpponentNetworkEntity> serializer() {
            return OpponentNetworkEntity$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OpponentNetworkEntity(String str, String str2, String str3, String str4, int i, int i2) {
        if (31 != (i & 31)) {
            hl3.b(i, 31, OpponentNetworkEntity$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.t = i2;
        this.u = str;
        this.v = str2;
        this.w = str3;
        this.x = str4;
    }

    @Override // defpackage.f93
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ps6 a() {
        return new ps6(this.u, this.v, this.w, this.x, this.t);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OpponentNetworkEntity)) {
            return false;
        }
        OpponentNetworkEntity opponentNetworkEntity = (OpponentNetworkEntity) obj;
        return this.t == opponentNetworkEntity.t && xj5.a(this.u, opponentNetworkEntity.u) && xj5.a(this.v, opponentNetworkEntity.v) && xj5.a(this.w, opponentNetworkEntity.w) && xj5.a(this.x, opponentNetworkEntity.x);
    }

    public final int hashCode() {
        int iC = ru3.c(Integer.hashCode(this.t) * 31, 31, this.u);
        String str = this.v;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.w;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.x;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbA = il.a("OpponentNetworkEntity(id=", ", fullName=", this.u, ", firstName=", this.t);
        ux1.b(sbA, this.v, ", lastName=", this.w, ", avatarUrl=");
        return av.a(sbA, this.x, ")");
    }
}

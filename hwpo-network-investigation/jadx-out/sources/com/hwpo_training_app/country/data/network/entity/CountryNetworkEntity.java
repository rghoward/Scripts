package com.hwpo_training_app.country.data.network.entity;

import defpackage.hl3;
import defpackage.op3;
import defpackage.rd9;
import defpackage.xj5;
import kotlinx.serialization.KSerializer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@rd9
public final class CountryNetworkEntity {
    public static final Companion Companion = new Companion();
    public final String a;
    public final String b;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public final KSerializer<CountryNetworkEntity> serializer() {
            return CountryNetworkEntity$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CountryNetworkEntity(int i, String str, String str2) {
        if (3 != (i & 3)) {
            hl3.b(i, 3, CountryNetworkEntity$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CountryNetworkEntity)) {
            return false;
        }
        CountryNetworkEntity countryNetworkEntity = (CountryNetworkEntity) obj;
        return xj5.a(this.a, countryNetworkEntity.a) && xj5.a(this.b, countryNetworkEntity.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return op3.a("CountryNetworkEntity(code=", this.a, ", name=", this.b, ")");
    }
}

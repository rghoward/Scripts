package com.hwpo_training_app.core.data.model.user;

import com.hwpo_training_app.core.data.model.gym.GymNetworkEntity;
import com.hwpo_training_app.core.data.model.gym.GymTypeNetworkEntity;
import com.hwpo_training_app.multilanguage.data.model.AppLanguageNetworkEntity;
import defpackage.bq4;
import defpackage.f93;
import defpackage.h5b;
import defpackage.hl3;
import defpackage.hv5;
import defpackage.il;
import defpackage.j26;
import defpackage.n33;
import defpackage.os2;
import defpackage.p49;
import defpackage.rd9;
import defpackage.ru3;
import defpackage.rz3;
import defpackage.s10;
import defpackage.ss5;
import defpackage.u;
import defpackage.uj4;
import defpackage.ux1;
import defpackage.v5b;
import defpackage.xj5;
import defpackage.ylb;
import defpackage.yp4;
import defpackage.zp4;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneOffset;
import kotlinx.serialization.KSerializer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@rd9
public final class UserNetworkEntity implements f93<h5b> {
    public static final Companion Companion = new Companion();
    public static final ss5<KSerializer<Object>>[] K;
    public final Long A;
    public final String B;
    public final GymTypeNetworkEntity C;
    public final GymNetworkEntity D;
    public final GenderNetworkEntity E;
    public final WeightUnitsNetworkEntity F;
    public final LengthUnitsNetworkEntity G;
    public final Boolean H;
    public final Boolean I;
    public final AppLanguageNetworkEntity J;
    public final int t;
    public final String u;
    public final String v;
    public final String w;
    public final String x;
    public final String y;
    public final int z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public final KSerializer<UserNetworkEntity> serializer() {
            return UserNetworkEntity$$serializer.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[GymTypeNetworkEntity.values().length];
            try {
                GymTypeNetworkEntity.Companion companion = GymTypeNetworkEntity.Companion;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                GymTypeNetworkEntity.Companion companion2 = GymTypeNetworkEntity.Companion;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                GymTypeNetworkEntity.Companion companion3 = GymTypeNetworkEntity.Companion;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    static {
        int i = 1;
        p49 p49Var = new p49(i);
        j26 j26Var = j26.t;
        K = new ss5[]{null, null, null, null, null, null, null, null, null, hv5.c(j26Var, p49Var), null, hv5.c(j26Var, new rz3(1)), hv5.c(j26Var, new zp4(i)), hv5.c(j26Var, new v5b()), null, null, hv5.c(j26Var, new bq4(i))};
    }

    public /* synthetic */ UserNetworkEntity(int i, int i2, String str, String str2, String str3, String str4, String str5, int i3, Long l, String str6, GymTypeNetworkEntity gymTypeNetworkEntity, GymNetworkEntity gymNetworkEntity, GenderNetworkEntity genderNetworkEntity, WeightUnitsNetworkEntity weightUnitsNetworkEntity, LengthUnitsNetworkEntity lengthUnitsNetworkEntity, Boolean bool, Boolean bool2, AppLanguageNetworkEntity appLanguageNetworkEntity) {
        if (339 != (i & 339)) {
            hl3.b(i, 339, UserNetworkEntity$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.t = i2;
        this.u = str;
        if ((i & 4) == 0) {
            this.v = null;
        } else {
            this.v = str2;
        }
        if ((i & 8) == 0) {
            this.w = null;
        } else {
            this.w = str3;
        }
        this.x = str4;
        if ((i & 32) == 0) {
            this.y = null;
        } else {
            this.y = str5;
        }
        this.z = i3;
        if ((i & 128) == 0) {
            this.A = null;
        } else {
            this.A = l;
        }
        this.B = str6;
        if ((i & 512) == 0) {
            this.C = null;
        } else {
            this.C = gymTypeNetworkEntity;
        }
        if ((i & 1024) == 0) {
            this.D = null;
        } else {
            this.D = gymNetworkEntity;
        }
        if ((i & AudioConstants.AUDIO_FILE_BUFFER_SIZE) == 0) {
            this.E = null;
        } else {
            this.E = genderNetworkEntity;
        }
        if ((i & 4096) == 0) {
            this.F = null;
        } else {
            this.F = weightUnitsNetworkEntity;
        }
        if ((i & 8192) == 0) {
            this.G = null;
        } else {
            this.G = lengthUnitsNetworkEntity;
        }
        if ((i & 16384) == 0) {
            this.H = null;
        } else {
            this.H = bool;
        }
        if ((32768 & i) == 0) {
            this.I = null;
        } else {
            this.I = bool2;
        }
        if ((i & 65536) == 0) {
            this.J = null;
        } else {
            this.J = appLanguageNetworkEntity;
        }
    }

    @Override // defpackage.f93
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final h5b a() {
        LocalDate localDate;
        yp4 yp4Var;
        yp4 yp4VarB;
        Long l = this.A;
        if (l != null) {
            long jLongValue = l.longValue();
            ZoneOffset zoneOffset = ZoneOffset.UTC;
            zoneOffset.getClass();
            LocalDate localDate2 = Instant.ofEpochSecond(jLongValue).atOffset(zoneOffset).toLocalDate();
            localDate2.getClass();
            localDate = localDate2;
        } else {
            localDate = null;
        }
        GymTypeNetworkEntity gymTypeNetworkEntity = this.C;
        int i = gymTypeNetworkEntity == null ? -1 : a.a[gymTypeNetworkEntity.ordinal()];
        if (i != -1) {
            if (i == 1) {
                yp4VarB = yp4.b.t;
            } else if (i == 2) {
                yp4VarB = yp4.c.t;
            } else {
                if (i != 3) {
                    u.b();
                    return null;
                }
                GymNetworkEntity gymNetworkEntity = this.D;
                yp4VarB = gymNetworkEntity != null ? gymNetworkEntity.a() : null;
            }
            yp4Var = yp4VarB;
        } else {
            yp4Var = null;
        }
        GenderNetworkEntity genderNetworkEntity = this.E;
        uj4 uj4VarA = genderNetworkEntity != null ? genderNetworkEntity.a() : null;
        WeightUnitsNetworkEntity weightUnitsNetworkEntity = this.F;
        ylb ylbVarA = weightUnitsNetworkEntity != null ? weightUnitsNetworkEntity.a() : null;
        LengthUnitsNetworkEntity lengthUnitsNetworkEntity = this.G;
        n33 n33VarA = lengthUnitsNetworkEntity != null ? lengthUnitsNetworkEntity.a() : null;
        Boolean bool = this.H;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        Boolean bool2 = this.I;
        boolean z = !(bool2 != null ? bool2.booleanValue() : false);
        AppLanguageNetworkEntity appLanguageNetworkEntity = this.J;
        return new h5b(this.t, this.u, this.v, this.w, this.x, this.y, this.z, localDate, this.B, yp4Var, uj4VarA, ylbVarA, n33VarA, zBooleanValue, z, appLanguageNetworkEntity != null ? appLanguageNetworkEntity.a() : s10.ENGLISH);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserNetworkEntity)) {
            return false;
        }
        UserNetworkEntity userNetworkEntity = (UserNetworkEntity) obj;
        return this.t == userNetworkEntity.t && xj5.a(this.u, userNetworkEntity.u) && xj5.a(this.v, userNetworkEntity.v) && xj5.a(this.w, userNetworkEntity.w) && xj5.a(this.x, userNetworkEntity.x) && xj5.a(this.y, userNetworkEntity.y) && this.z == userNetworkEntity.z && xj5.a(this.A, userNetworkEntity.A) && xj5.a(this.B, userNetworkEntity.B) && this.C == userNetworkEntity.C && xj5.a(this.D, userNetworkEntity.D) && this.E == userNetworkEntity.E && this.F == userNetworkEntity.F && this.G == userNetworkEntity.G && xj5.a(this.H, userNetworkEntity.H) && xj5.a(this.I, userNetworkEntity.I) && this.J == userNetworkEntity.J;
    }

    public final int hashCode() {
        int iC = ru3.c(Integer.hashCode(this.t) * 31, 31, this.u);
        String str = this.v;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.w;
        int iC2 = ru3.c((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.x);
        String str3 = this.y;
        int iA = os2.a(this.z, (iC2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31);
        Long l = this.A;
        int iC3 = ru3.c((iA + (l == null ? 0 : l.hashCode())) * 31, 31, this.B);
        GymTypeNetworkEntity gymTypeNetworkEntity = this.C;
        int iHashCode2 = (iC3 + (gymTypeNetworkEntity == null ? 0 : gymTypeNetworkEntity.hashCode())) * 31;
        GymNetworkEntity gymNetworkEntity = this.D;
        int iHashCode3 = (iHashCode2 + (gymNetworkEntity == null ? 0 : gymNetworkEntity.hashCode())) * 31;
        GenderNetworkEntity genderNetworkEntity = this.E;
        int iHashCode4 = (iHashCode3 + (genderNetworkEntity == null ? 0 : genderNetworkEntity.hashCode())) * 31;
        WeightUnitsNetworkEntity weightUnitsNetworkEntity = this.F;
        int iHashCode5 = (iHashCode4 + (weightUnitsNetworkEntity == null ? 0 : weightUnitsNetworkEntity.hashCode())) * 31;
        LengthUnitsNetworkEntity lengthUnitsNetworkEntity = this.G;
        int iHashCode6 = (iHashCode5 + (lengthUnitsNetworkEntity == null ? 0 : lengthUnitsNetworkEntity.hashCode())) * 31;
        Boolean bool = this.H;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.I;
        int iHashCode8 = (iHashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        AppLanguageNetworkEntity appLanguageNetworkEntity = this.J;
        return iHashCode8 + (appLanguageNetworkEntity != null ? appLanguageNetworkEntity.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbA = il.a("UserNetworkEntity(id=", ", fullName=", this.u, ", firstName=", this.t);
        ux1.b(sbA, this.v, ", lastName=", this.w, ", email=");
        ux1.b(sbA, this.x, ", avatarUrl=", this.y, ", age=");
        sbA.append(this.z);
        sbA.append(", birthDate=");
        sbA.append(this.A);
        sbA.append(", country=");
        sbA.append(this.B);
        sbA.append(", gymType=");
        sbA.append(this.C);
        sbA.append(", gym=");
        sbA.append(this.D);
        sbA.append(", gender=");
        sbA.append(this.E);
        sbA.append(", weightUnits=");
        sbA.append(this.F);
        sbA.append(", lengthUnits=");
        sbA.append(this.G);
        sbA.append(", canReviewApp=");
        sbA.append(this.H);
        sbA.append(", isUserCommentsBlocked=");
        sbA.append(this.I);
        sbA.append(", appLanguage=");
        sbA.append(this.J);
        sbA.append(")");
        return sbA.toString();
    }
}

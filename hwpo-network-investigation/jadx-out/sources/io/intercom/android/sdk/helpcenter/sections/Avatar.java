package io.intercom.android.sdk.helpcenter.sections;

import com.intercom.twig.BuildConfig;
import defpackage.qq2;
import defpackage.rd9;
import defpackage.sd9;
import defpackage.st1;
import defpackage.wu0;
import defpackage.xj5;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@rd9
public final class Avatar {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String imageUrl;
    private final String initials;

    public /* synthetic */ Avatar(int i, String str, String str2, sd9 sd9Var) {
        if ((i & 1) == 0) {
            this.initials = BuildConfig.FLAVOR;
        } else {
            this.initials = str;
        }
        if ((i & 2) == 0) {
            this.imageUrl = BuildConfig.FLAVOR;
        } else {
            this.imageUrl = str2;
        }
    }

    public static /* synthetic */ Avatar copy$default(Avatar avatar, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = avatar.initials;
        }
        if ((i & 2) != 0) {
            str2 = avatar.imageUrl;
        }
        return avatar.copy(str, str2);
    }

    public static final /* synthetic */ void write$Self$intercom_sdk_base_release(Avatar avatar, st1 st1Var, SerialDescriptor serialDescriptor) {
        if (st1Var.C(serialDescriptor) || !xj5.a(avatar.initials, BuildConfig.FLAVOR)) {
            st1Var.p(serialDescriptor, 0, avatar.initials);
        }
        if (!st1Var.C(serialDescriptor) && xj5.a(avatar.imageUrl, BuildConfig.FLAVOR)) {
            return;
        }
        st1Var.p(serialDescriptor, 1, avatar.imageUrl);
    }

    public final String component1() {
        return this.initials;
    }

    public final String component2() {
        return this.imageUrl;
    }

    public final Avatar copy(String str, String str2) {
        str.getClass();
        str2.getClass();
        return new Avatar(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Avatar)) {
            return false;
        }
        Avatar avatar = (Avatar) obj;
        return xj5.a(this.initials, avatar.initials) && xj5.a(this.imageUrl, avatar.imageUrl);
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getInitials() {
        return this.initials;
    }

    public int hashCode() {
        return this.imageUrl.hashCode() + (this.initials.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Avatar(initials=");
        sb.append(this.initials);
        sb.append(", imageUrl=");
        return wu0.a(sb, this.imageUrl, ')');
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer<Avatar> serializer() {
            return Avatar$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(qq2 qq2Var) {
            this();
        }
    }

    public static /* synthetic */ void getImageUrl$annotations() {
    }

    public static /* synthetic */ void getInitials$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Avatar() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (qq2) (0 == true ? 1 : 0));
    }

    public Avatar(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.initials = str;
        this.imageUrl = str2;
    }

    public /* synthetic */ Avatar(String str, String str2, int i, qq2 qq2Var) {
        this((i & 1) != 0 ? BuildConfig.FLAVOR : str, (i & 2) != 0 ? BuildConfig.FLAVOR : str2);
    }
}

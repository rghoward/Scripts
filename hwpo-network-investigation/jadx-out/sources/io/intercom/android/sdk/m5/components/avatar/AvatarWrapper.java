package io.intercom.android.sdk.m5.components.avatar;

import com.intercom.twig.BuildConfig;
import defpackage.jt1;
import defpackage.pi1;
import defpackage.qq2;
import defpackage.xj5;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.utilities.ThemeUtils;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class AvatarWrapper {
    public static final int $stable = 8;
    public static final Companion Companion;
    private static final AvatarWrapper NULL;
    private final Avatar avatar;
    private final String initials;
    private final boolean isBot;
    private final String label;

    static {
        qq2 qq2Var = null;
        Companion = new Companion(qq2Var);
        Avatar avatar = Avatar.NULL;
        avatar.getClass();
        NULL = new AvatarWrapper(avatar, false, 2, qq2Var);
    }

    public AvatarWrapper(Avatar avatar, boolean z) {
        avatar.getClass();
        this.avatar = avatar;
        this.isBot = z;
        String initials = avatar.getInitials();
        initials.getClass();
        this.initials = initials;
        String label = avatar.getLabel();
        label.getClass();
        this.label = label;
    }

    public static /* synthetic */ AvatarWrapper copy$default(AvatarWrapper avatarWrapper, Avatar avatar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            avatar = avatarWrapper.avatar;
        }
        if ((i & 2) != 0) {
            z = avatarWrapper.isBot;
        }
        return avatarWrapper.copy(avatar, z);
    }

    public final Avatar component1() {
        return this.avatar;
    }

    public final boolean component2() {
        return this.isBot;
    }

    public final AvatarWrapper copy(Avatar avatar, boolean z) {
        avatar.getClass();
        return new AvatarWrapper(avatar, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AvatarWrapper)) {
            return false;
        }
        AvatarWrapper avatarWrapper = (AvatarWrapper) obj;
        return xj5.a(this.avatar, avatarWrapper.avatar) && this.isBot == avatarWrapper.isBot;
    }

    public final Avatar getAvatar() {
        return this.avatar;
    }

    public final String getImageUrl(jt1 jt1Var, int i) {
        jt1Var.K(1575443384);
        String strSelectUrlForThemeCompose$intercom_sdk_base_release = ThemeUtils.INSTANCE.selectUrlForThemeCompose$intercom_sdk_base_release(this.avatar.getImageUrl(), this.avatar.getImageDarkUrl(), jt1Var, 384);
        if (strSelectUrlForThemeCompose$intercom_sdk_base_release == null) {
            strSelectUrlForThemeCompose$intercom_sdk_base_release = BuildConfig.FLAVOR;
        }
        jt1Var.B();
        return strSelectUrlForThemeCompose$intercom_sdk_base_release;
    }

    public final String getInitials() {
        return this.initials;
    }

    public final String getLabel() {
        return this.label;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isBot) + (this.avatar.hashCode() * 31);
    }

    public final boolean isBot() {
        return this.isBot;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AvatarWrapper(avatar=");
        sb.append(this.avatar);
        sb.append(", isBot=");
        return pi1.a(sb, this.isBot, ')');
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public /* synthetic */ Companion(qq2 qq2Var) {
            this();
        }

        public final AvatarWrapper getNULL() {
            return AvatarWrapper.NULL;
        }

        private Companion() {
        }
    }

    public /* synthetic */ AvatarWrapper(Avatar avatar, boolean z, int i, qq2 qq2Var) {
        this(avatar, (i & 2) != 0 ? false : z);
    }
}

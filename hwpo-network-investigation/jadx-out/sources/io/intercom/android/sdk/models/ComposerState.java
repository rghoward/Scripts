package io.intercom.android.sdk.models;

import com.google.gson.annotations.SerializedName;
import com.intercom.twig.BuildConfig;
import defpackage.qq2;
import defpackage.uo2;
import defpackage.wu0;
import defpackage.xj5;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposerState {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final ComposerState NULL = new ComposerState("visible_and_enabled", false, BuildConfig.FLAVOR);

    @SerializedName("workflow_active")
    private final boolean isWorkflowActive;

    @SerializedName("placeholder")
    private final String placeholder;

    @SerializedName("visibility")
    private final String visibility;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface ComposerVisibility {

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class Hidden implements ComposerVisibility {
            public static final int $stable = 0;
            public static final Hidden INSTANCE = new Hidden();

            private Hidden() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Hidden);
            }

            public int hashCode() {
                return 421902457;
            }

            public String toString() {
                return "Hidden";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class VisibleAndDisabled implements ComposerVisibility {
            public static final int $stable = 0;
            public static final VisibleAndDisabled INSTANCE = new VisibleAndDisabled();

            private VisibleAndDisabled() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof VisibleAndDisabled);
            }

            public int hashCode() {
                return 1977747952;
            }

            public String toString() {
                return "VisibleAndDisabled";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class VisibleAndEnabled implements ComposerVisibility {
            public static final int $stable = 0;
            public static final VisibleAndEnabled INSTANCE = new VisibleAndEnabled();

            private VisibleAndEnabled() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof VisibleAndEnabled);
            }

            public int hashCode() {
                return -861799091;
            }

            public String toString() {
                return "VisibleAndEnabled";
            }
        }
    }

    public ComposerState(String str, boolean z, String str2) {
        str.getClass();
        str2.getClass();
        this.visibility = str;
        this.isWorkflowActive = z;
        this.placeholder = str2;
    }

    private final String component1() {
        return this.visibility;
    }

    public static /* synthetic */ ComposerState copy$default(ComposerState composerState, String str, boolean z, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = composerState.visibility;
        }
        if ((i & 2) != 0) {
            z = composerState.isWorkflowActive;
        }
        if ((i & 4) != 0) {
            str2 = composerState.placeholder;
        }
        return composerState.copy(str, z, str2);
    }

    private final ComposerVisibility getComposerVisibility() {
        String str = this.visibility;
        int iHashCode = str.hashCode();
        if (iHashCode != -1217487446) {
            if (iHashCode != -888711535) {
                if (iHashCode == 1262491788 && str.equals("visible_and_enabled")) {
                    return ComposerVisibility.VisibleAndEnabled.INSTANCE;
                }
            } else if (str.equals("visible_and_disabled")) {
                return ComposerVisibility.VisibleAndDisabled.INSTANCE;
            }
        } else if (str.equals("hidden")) {
            return ComposerVisibility.Hidden.INSTANCE;
        }
        return ComposerVisibility.VisibleAndEnabled.INSTANCE;
    }

    public final boolean component2() {
        return this.isWorkflowActive;
    }

    public final String component3() {
        return this.placeholder;
    }

    public final ComposerState copy(String str, boolean z, String str2) {
        str.getClass();
        str2.getClass();
        return new ComposerState(str, z, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComposerState)) {
            return false;
        }
        ComposerState composerState = (ComposerState) obj;
        return xj5.a(this.visibility, composerState.visibility) && this.isWorkflowActive == composerState.isWorkflowActive && xj5.a(this.placeholder, composerState.placeholder);
    }

    public final String getPlaceholder() {
        return this.placeholder;
    }

    public int hashCode() {
        return this.placeholder.hashCode() + uo2.a(this.visibility.hashCode() * 31, this.isWorkflowActive, 31);
    }

    public final boolean isDisabled() {
        return xj5.a(getComposerVisibility(), ComposerVisibility.VisibleAndDisabled.INSTANCE);
    }

    public final boolean isVisible() {
        return !xj5.a(getComposerVisibility(), ComposerVisibility.Hidden.INSTANCE);
    }

    public final boolean isWorkflowActive() {
        return this.isWorkflowActive;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ComposerState(visibility=");
        sb.append(this.visibility);
        sb.append(", isWorkflowActive=");
        sb.append(this.isWorkflowActive);
        sb.append(", placeholder=");
        return wu0.a(sb, this.placeholder, ')');
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public /* synthetic */ Companion(qq2 qq2Var) {
            this();
        }

        public final ComposerState getNULL() {
            return ComposerState.NULL;
        }

        private Companion() {
        }
    }
}

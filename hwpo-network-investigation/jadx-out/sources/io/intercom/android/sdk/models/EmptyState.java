package io.intercom.android.sdk.models;

import com.google.gson.annotations.SerializedName;
import com.intercom.twig.BuildConfig;
import defpackage.qq2;
import defpackage.ru3;
import defpackage.xj5;
import io.intercom.android.sdk.m5.home.data.IconType;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class EmptyState {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final EmptyState NULL = new EmptyState(null, null, null, 7, null);

    @SerializedName("action")
    private final Action action;

    @SerializedName(AttributeType.TEXT)
    private final String text;

    @SerializedName("title")
    private final String title;

    public /* synthetic */ EmptyState(String str, String str2, Action action, int i, qq2 qq2Var) {
        this((i & 1) != 0 ? BuildConfig.FLAVOR : str, (i & 2) != 0 ? BuildConfig.FLAVOR : str2, (i & 4) != 0 ? new Action(null, null, null, 7, null) : action);
    }

    public static /* synthetic */ EmptyState copy$default(EmptyState emptyState, String str, String str2, Action action, int i, Object obj) {
        if ((i & 1) != 0) {
            str = emptyState.title;
        }
        if ((i & 2) != 0) {
            str2 = emptyState.text;
        }
        if ((i & 4) != 0) {
            action = emptyState.action;
        }
        return emptyState.copy(str, str2, action);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.text;
    }

    public final Action component3() {
        return this.action;
    }

    public final EmptyState copy(String str, String str2, Action action) {
        str.getClass();
        str2.getClass();
        action.getClass();
        return new EmptyState(str, str2, action);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmptyState)) {
            return false;
        }
        EmptyState emptyState = (EmptyState) obj;
        return xj5.a(this.title, emptyState.title) && xj5.a(this.text, emptyState.text) && xj5.a(this.action, emptyState.action);
    }

    public final Action getAction() {
        return this.action;
    }

    public final String getText() {
        return this.text;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.action.hashCode() + ru3.c(this.title.hashCode() * 31, 31, this.text);
    }

    public String toString() {
        return "EmptyState(title=" + this.title + ", text=" + this.text + ", action=" + this.action + ')';
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public /* synthetic */ Companion(qq2 qq2Var) {
            this();
        }

        public final EmptyState getNULL() {
            return EmptyState.NULL;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Action {
        public static final int $stable = 0;

        @SerializedName("icon")
        private final IconType icon;

        @SerializedName("label")
        private final String label;

        @SerializedName("type")
        private final ActionType type;

        public /* synthetic */ Action(ActionType actionType, String str, IconType iconType, int i, qq2 qq2Var) {
            this((i & 1) != 0 ? ActionType.MESSAGE : actionType, (i & 2) != 0 ? BuildConfig.FLAVOR : str, (i & 4) != 0 ? null : iconType);
        }

        public static /* synthetic */ Action copy$default(Action action, ActionType actionType, String str, IconType iconType, int i, Object obj) {
            if ((i & 1) != 0) {
                actionType = action.type;
            }
            if ((i & 2) != 0) {
                str = action.label;
            }
            if ((i & 4) != 0) {
                iconType = action.icon;
            }
            return action.copy(actionType, str, iconType);
        }

        public final ActionType component1() {
            return this.type;
        }

        public final String component2() {
            return this.label;
        }

        public final IconType component3() {
            return this.icon;
        }

        public final Action copy(ActionType actionType, String str, IconType iconType) {
            actionType.getClass();
            str.getClass();
            return new Action(actionType, str, iconType);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Action)) {
                return false;
            }
            Action action = (Action) obj;
            return this.type == action.type && xj5.a(this.label, action.label) && this.icon == action.icon;
        }

        public final IconType getIcon() {
            return this.icon;
        }

        public final String getLabel() {
            return this.label;
        }

        public final ActionType getType() {
            return this.type;
        }

        public int hashCode() {
            int iC = ru3.c(this.type.hashCode() * 31, 31, this.label);
            IconType iconType = this.icon;
            return iC + (iconType == null ? 0 : iconType.hashCode());
        }

        public String toString() {
            return "Action(type=" + this.type + ", label=" + this.label + ", icon=" + this.icon + ')';
        }

        public Action(ActionType actionType, String str, IconType iconType) {
            actionType.getClass();
            str.getClass();
            this.type = actionType;
            this.label = str;
            this.icon = iconType;
        }

        public Action() {
            this(null, null, null, 7, null);
        }
    }

    public EmptyState(String str, String str2, Action action) {
        str.getClass();
        str2.getClass();
        action.getClass();
        this.title = str;
        this.text = str2;
        this.action = action;
    }

    public EmptyState() {
        this(null, null, null, 7, null);
    }
}

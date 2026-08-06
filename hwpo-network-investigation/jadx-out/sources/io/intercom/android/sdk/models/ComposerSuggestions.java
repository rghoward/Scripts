package io.intercom.android.sdk.models;

import com.google.gson.annotations.SerializedName;
import com.intercom.twig.BuildConfig;
import defpackage.hf3;
import defpackage.qq2;
import defpackage.uo2;
import defpackage.wu0;
import defpackage.xj5;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposerSuggestions {
    public static final int $stable = 8;

    @SerializedName("composer_disabled")
    private final boolean isComposerDisabled;

    @SerializedName("snapshot_id")
    private final Long snapshotId;

    @SerializedName("suggestions")
    private final List<Suggestion> suggestions;

    public /* synthetic */ ComposerSuggestions(List list, boolean z, Long l, int i, qq2 qq2Var) {
        this((i & 1) != 0 ? hf3.t : list, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : l);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ComposerSuggestions copy$default(ComposerSuggestions composerSuggestions, List list, boolean z, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            list = composerSuggestions.suggestions;
        }
        if ((i & 2) != 0) {
            z = composerSuggestions.isComposerDisabled;
        }
        if ((i & 4) != 0) {
            l = composerSuggestions.snapshotId;
        }
        return composerSuggestions.copy(list, z, l);
    }

    public final List<Suggestion> component1() {
        return this.suggestions;
    }

    public final boolean component2() {
        return this.isComposerDisabled;
    }

    public final Long component3() {
        return this.snapshotId;
    }

    public final ComposerSuggestions copy(List<Suggestion> list, boolean z, Long l) {
        list.getClass();
        return new ComposerSuggestions(list, z, l);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComposerSuggestions)) {
            return false;
        }
        ComposerSuggestions composerSuggestions = (ComposerSuggestions) obj;
        return xj5.a(this.suggestions, composerSuggestions.suggestions) && this.isComposerDisabled == composerSuggestions.isComposerDisabled && xj5.a(this.snapshotId, composerSuggestions.snapshotId);
    }

    public final Long getSnapshotId() {
        return this.snapshotId;
    }

    public final List<Suggestion> getSuggestions() {
        return this.suggestions;
    }

    public int hashCode() {
        int iA = uo2.a(this.suggestions.hashCode() * 31, this.isComposerDisabled, 31);
        Long l = this.snapshotId;
        return iA + (l == null ? 0 : l.hashCode());
    }

    public final boolean isComposerDisabled() {
        return this.isComposerDisabled;
    }

    public String toString() {
        return "ComposerSuggestions(suggestions=" + this.suggestions + ", isComposerDisabled=" + this.isComposerDisabled + ", snapshotId=" + this.snapshotId + ')';
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Suggestion {
        public static final int $stable = 0;

        @SerializedName(AttributeType.TEXT)
        private final String text;

        @SerializedName("uuid")
        private final String uuid;

        public /* synthetic */ Suggestion(String str, String str2, int i, qq2 qq2Var) {
            this((i & 1) != 0 ? BuildConfig.FLAVOR : str, (i & 2) != 0 ? BuildConfig.FLAVOR : str2);
        }

        public static /* synthetic */ Suggestion copy$default(Suggestion suggestion, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = suggestion.text;
            }
            if ((i & 2) != 0) {
                str2 = suggestion.uuid;
            }
            return suggestion.copy(str, str2);
        }

        public final String component1() {
            return this.text;
        }

        public final String component2() {
            return this.uuid;
        }

        public final Suggestion copy(String str, String str2) {
            str.getClass();
            str2.getClass();
            return new Suggestion(str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Suggestion)) {
                return false;
            }
            Suggestion suggestion = (Suggestion) obj;
            return xj5.a(this.text, suggestion.text) && xj5.a(this.uuid, suggestion.uuid);
        }

        public final String getText() {
            return this.text;
        }

        public final String getUuid() {
            return this.uuid;
        }

        public int hashCode() {
            return this.uuid.hashCode() + (this.text.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Suggestion(text=");
            sb.append(this.text);
            sb.append(", uuid=");
            return wu0.a(sb, this.uuid, ')');
        }

        public Suggestion(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.text = str;
            this.uuid = str2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Suggestion() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    public ComposerSuggestions(List<Suggestion> list, boolean z, Long l) {
        list.getClass();
        this.suggestions = list;
        this.isComposerDisabled = z;
        this.snapshotId = l;
    }

    public ComposerSuggestions() {
        this(null, false, null, 7, null);
    }
}

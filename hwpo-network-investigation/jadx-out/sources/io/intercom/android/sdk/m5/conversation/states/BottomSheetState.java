package io.intercom.android.sdk.m5.conversation.states;

import defpackage.xj5;
import defpackage.zc6;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.models.InlineSource;
import io.intercom.android.sdk.models.Source;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public interface BottomSheetState {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Empty implements BottomSheetState {
        public static final int $stable = 0;
        public static final Empty INSTANCE = new Empty();

        private Empty() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Empty);
        }

        public int hashCode() {
            return -1704299409;
        }

        public String toString() {
            return "Empty";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class GifSearch implements BottomSheetState {
        public static final int $stable = 8;
        private final List<Block> gifs;

        /* JADX WARN: Multi-variable type inference failed */
        public GifSearch(List<? extends Block> list) {
            list.getClass();
            this.gifs = list;
        }

        public final List<Block> getGifs() {
            return this.gifs;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class InlineSources implements BottomSheetState {
        public static final int $stable = 8;
        private final List<InlineSource> selectedSources;
        private final List<Source> sources;

        public InlineSources(List<InlineSource> list, List<Source> list2) {
            list.getClass();
            list2.getClass();
            this.selectedSources = list;
            this.sources = list2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ InlineSources copy$default(InlineSources inlineSources, List list, List list2, int i, Object obj) {
            if ((i & 1) != 0) {
                list = inlineSources.selectedSources;
            }
            if ((i & 2) != 0) {
                list2 = inlineSources.sources;
            }
            return inlineSources.copy(list, list2);
        }

        public final List<InlineSource> component1() {
            return this.selectedSources;
        }

        public final List<Source> component2() {
            return this.sources;
        }

        public final InlineSources copy(List<InlineSource> list, List<Source> list2) {
            list.getClass();
            list2.getClass();
            return new InlineSources(list, list2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InlineSources)) {
                return false;
            }
            InlineSources inlineSources = (InlineSources) obj;
            return xj5.a(this.selectedSources, inlineSources.selectedSources) && xj5.a(this.sources, inlineSources.sources);
        }

        public final List<InlineSource> getSelectedSources() {
            return this.selectedSources;
        }

        public final List<Source> getSources() {
            return this.sources;
        }

        public int hashCode() {
            return this.sources.hashCode() + (this.selectedSources.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("InlineSources(selectedSources=");
            sb.append(this.selectedSources);
            sb.append(", sources=");
            return zc6.a(sb, this.sources, ')');
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class MediaInput implements BottomSheetState {
        public static final int $stable = 0;
        public static final MediaInput INSTANCE = new MediaInput();

        private MediaInput() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof MediaInput);
        }

        public int hashCode() {
            return -1100907420;
        }

        public String toString() {
            return "MediaInput";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class TeammatePresence implements BottomSheetState {
        public static final int $stable = 0;
        public static final TeammatePresence INSTANCE = new TeammatePresence();

        private TeammatePresence() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof TeammatePresence);
        }

        public int hashCode() {
            return 298154395;
        }

        public String toString() {
            return "TeammatePresence";
        }
    }
}

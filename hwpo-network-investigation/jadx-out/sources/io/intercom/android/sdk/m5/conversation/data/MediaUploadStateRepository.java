package io.intercom.android.sdk.m5.conversation.data;

import defpackage.a0a;
import defpackage.b0a;
import defpackage.e44;
import defpackage.el5;
import defpackage.gl8;
import defpackage.hf3;
import defpackage.i37;
import defpackage.oy0;
import defpackage.ph1;
import defpackage.qq2;
import defpackage.t72;
import defpackage.th1;
import defpackage.xj5;
import defpackage.yk2;
import defpackage.zz9;
import io.intercom.android.sdk.m5.conversation.states.MediaUploadItem;
import io.intercom.android.sdk.m5.upload.data.MediaData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class MediaUploadStateRepository {
    public static final int MAX_MEDIA_ITEMS = 10;
    private final i37<List<MediaUploadItem>> _uploadStates;
    private final MediaUploadRepository mediaUploadRepository;
    private int transparencyBackgroundColor;
    private final Map<String, el5> uploadJobs;
    private final zz9<List<MediaUploadItem>> uploadStates;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class AddResult {
        public static final int $stable = 0;
        private final int addedCount;
        private final int rejectedByLimit;

        public AddResult(int i, int i2) {
            this.addedCount = i;
            this.rejectedByLimit = i2;
        }

        public static /* synthetic */ AddResult copy$default(AddResult addResult, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = addResult.addedCount;
            }
            if ((i3 & 2) != 0) {
                i2 = addResult.rejectedByLimit;
            }
            return addResult.copy(i, i2);
        }

        public final int component1() {
            return this.addedCount;
        }

        public final int component2() {
            return this.rejectedByLimit;
        }

        public final AddResult copy(int i, int i2) {
            return new AddResult(i, i2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AddResult)) {
                return false;
            }
            AddResult addResult = (AddResult) obj;
            return this.addedCount == addResult.addedCount && this.rejectedByLimit == addResult.rejectedByLimit;
        }

        public final int getAddedCount() {
            return this.addedCount;
        }

        public final boolean getHasLimitRejections() {
            return this.rejectedByLimit > 0;
        }

        public final int getRejectedByLimit() {
            return this.rejectedByLimit;
        }

        public int hashCode() {
            return Integer.hashCode(this.rejectedByLimit) + (Integer.hashCode(this.addedCount) * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("AddResult(addedCount=");
            sb.append(this.addedCount);
            sb.append(", rejectedByLimit=");
            return e44.a(sb, this.rejectedByLimit, ')');
        }
    }

    public MediaUploadStateRepository(MediaUploadRepository mediaUploadRepository) {
        mediaUploadRepository.getClass();
        this.mediaUploadRepository = mediaUploadRepository;
        a0a a0aVarB = b0a.b(hf3.t);
        this._uploadStates = a0aVarB;
        this.uploadStates = yk2.b(a0aVarB);
        this.uploadJobs = new ConcurrentHashMap();
        this.transparencyBackgroundColor = -1;
    }

    public static /* synthetic */ AddResult addAndStartUploading$default(MediaUploadStateRepository mediaUploadStateRepository, List list, t72 t72Var, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = -1;
        }
        return mediaUploadStateRepository.addAndStartUploading(list, t72Var, i);
    }

    private final void startUploadJob(MediaUploadItem mediaUploadItem, t72 t72Var, int i) {
        this.uploadJobs.put(mediaUploadItem.getInstanceId(), oy0.d(t72Var, null, null, new MediaUploadStateRepository$startUploadJob$job$1(this, mediaUploadItem, i, null), 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateItemState(String str, MediaUploadItem.UploadState uploadState) {
        MediaUploadItem.UploadState uploadState2;
        i37<List<MediaUploadItem>> i37Var = this._uploadStates;
        while (true) {
            List<MediaUploadItem> value = i37Var.getValue();
            List<MediaUploadItem> list = value;
            ArrayList arrayList = new ArrayList(ph1.n(list, 10));
            for (MediaUploadItem mediaUploadItemCopy$default : list) {
                if (xj5.a(mediaUploadItemCopy$default.getInstanceId(), str)) {
                    uploadState2 = uploadState;
                    mediaUploadItemCopy$default = MediaUploadItem.copy$default(mediaUploadItemCopy$default, null, null, uploadState2, 3, null);
                } else {
                    uploadState2 = uploadState;
                }
                arrayList.add(mediaUploadItemCopy$default);
                uploadState = uploadState2;
            }
            MediaUploadItem.UploadState uploadState3 = uploadState;
            if (i37Var.c(value, arrayList)) {
                return;
            } else {
                uploadState = uploadState3;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [T, java.lang.Iterable, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v0, types: [T, hf3] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    public final AddResult addAndStartUploading(List<? extends MediaData.Media> list, t72 t72Var, int i) {
        List<MediaUploadItem> value;
        List<MediaUploadItem> list2;
        List<? extends MediaData.Media> list3;
        ?? O;
        int size;
        ?? arrayList;
        list.getClass();
        t72Var.getClass();
        this.transparencyBackgroundColor = i;
        gl8 gl8Var = new gl8();
        ?? r3 = hf3.t;
        gl8Var.t = r3;
        i37<List<MediaUploadItem>> i37Var = this._uploadStates;
        do {
            value = i37Var.getValue();
            list2 = value;
            int size2 = 10 - list2.size();
            if (size2 <= 0) {
                list3 = list;
                O = r3;
            } else {
                list3 = list;
                O = th1.O(size2, list3);
            }
            size = list3.size() - O.size();
            arrayList = new ArrayList(ph1.n(O, 10));
            Iterator it = O.iterator();
            while (it.hasNext()) {
                arrayList.add(new MediaUploadItem(null, (MediaData.Media) it.next(), MediaUploadItem.UploadState.Uploading.INSTANCE, 1, null));
            }
            gl8Var.t = arrayList;
        } while (!i37Var.c(value, th1.K(list2, arrayList)));
        Iterator it2 = ((Iterable) gl8Var.t).iterator();
        while (it2.hasNext()) {
            startUploadJob((MediaUploadItem) it2.next(), t72Var, i);
        }
        return new AddResult(((List) gl8Var.t).size(), size);
    }

    public final void cancelAllUploads() {
        Iterator<T> it = this.uploadJobs.values().iterator();
        while (it.hasNext()) {
            ((el5) it.next()).k(null);
        }
        this.uploadJobs.clear();
        this._uploadStates.setValue(hf3.t);
    }

    public final zz9<List<MediaUploadItem>> getUploadStates() {
        return this.uploadStates;
    }

    public final void removeMediaItem(String str) {
        List<MediaUploadItem> value;
        ArrayList arrayList;
        str.getClass();
        el5 el5Var = this.uploadJobs.get(str);
        if (el5Var != null) {
            el5Var.k(null);
        }
        this.uploadJobs.remove(str);
        i37<List<MediaUploadItem>> i37Var = this._uploadStates;
        do {
            value = i37Var.getValue();
            arrayList = new ArrayList();
            for (Object obj : value) {
                if (!xj5.a(((MediaUploadItem) obj).getInstanceId(), str)) {
                    arrayList.add(obj);
                }
            }
        } while (!i37Var.c(value, arrayList));
    }

    public final void retryUpload(String str, t72 t72Var) {
        str.getClass();
        t72Var.getClass();
        el5 el5Var = this.uploadJobs.get(str);
        Object obj = null;
        if (el5Var != null) {
            el5Var.k(null);
        }
        this.uploadJobs.remove(str);
        for (Object obj2 : this._uploadStates.getValue()) {
            if (xj5.a(((MediaUploadItem) obj2).getInstanceId(), str)) {
                obj = obj2;
                break;
            }
        }
        MediaUploadItem mediaUploadItem = (MediaUploadItem) obj;
        if (mediaUploadItem == null) {
            return;
        }
        updateItemState(str, MediaUploadItem.UploadState.Uploading.INSTANCE);
        startUploadJob(mediaUploadItem, t72Var, this.transparencyBackgroundColor);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public /* synthetic */ Companion(qq2 qq2Var) {
            this();
        }

        private Companion() {
        }
    }
}

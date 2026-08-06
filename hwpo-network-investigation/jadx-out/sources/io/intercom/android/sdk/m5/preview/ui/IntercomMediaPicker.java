package io.intercom.android.sdk.m5.preview.ui;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import android.webkit.MimeTypeMap;
import defpackage.gz3;
import defpackage.hf3;
import defpackage.o9;
import defpackage.qq2;
import defpackage.rh1;
import defpackage.th1;
import defpackage.u;
import defpackage.u30;
import defpackage.ws0;
import defpackage.z2a;
import defpackage.z90;
import io.intercom.android.sdk.models.AttributeType;
import io.intercom.android.sdk.models.carousel.AppearanceType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
final class IntercomMediaPicker extends o9<String, List<? extends Uri>> {
    private static final Map<String, List<String>> ADDITIONAL_MIME_TYPES;
    private static final Companion Companion = new Companion(null);
    private final int maxSelectionCount;
    private final MediaType mediaType;
    private final Set<String> trustedFileExtensions;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MediaType.values().length];
            try {
                iArr[MediaType.All.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MediaType.DocumentOnly.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MediaType.ImageAndVideo.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MediaType.ImageOnly.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MediaType.VideOnly.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        Map<String, List<String>> mapSingletonMap = Collections.singletonMap("csv", ws0.i("text/csv", "application/csv", "text/x-csv", "application/x-csv"));
        mapSingletonMap.getClass();
        ADDITIONAL_MIME_TYPES = mapSingletonMap;
    }

    public IntercomMediaPicker(MediaType mediaType, Set<String> set, int i) {
        mediaType.getClass();
        set.getClass();
        this.mediaType = mediaType;
        this.trustedFileExtensions = set;
        this.maxSelectionCount = i;
    }

    private final String[] getAllMimeTypes() {
        Set<String> set = this.trustedFileExtensions;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            rh1.o(getMimeTypesForExtension((String) it.next()), arrayList);
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    private final List<Uri> getClipDataUris(Intent intent) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Uri data = intent.getData();
        if (data != null) {
            linkedHashSet.add(data);
        }
        ClipData clipData = intent.getClipData();
        if (clipData == null && linkedHashSet.isEmpty()) {
            return hf3.t;
        }
        if (clipData != null) {
            int itemCount = clipData.getItemCount();
            for (int i = 0; i < itemCount; i++) {
                Uri uri = clipData.getItemAt(i).getUri();
                if (uri != null) {
                    linkedHashSet.add(uri);
                }
            }
        }
        return new ArrayList(linkedHashSet);
    }

    private final String[] getDocumentMimeTypes() {
        String[] allMimeTypes = getAllMimeTypes();
        ArrayList arrayList = new ArrayList();
        for (String str : allMimeTypes) {
            if (z2a.o(str, "application", false) || z2a.o(str, AttributeType.TEXT, false)) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    private final String[] getImageMimeTypes() {
        String[] allMimeTypes = getAllMimeTypes();
        ArrayList arrayList = new ArrayList();
        for (String str : allMimeTypes) {
            if (z2a.o(str, AppearanceType.IMAGE, false)) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    private final Intent getIntent(String str) {
        int i = WhenMappings.$EnumSwitchMapping$0[this.mediaType.ordinal()];
        if (i == 1) {
            Intent intentPutExtra = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").putExtra("android.intent.extra.MIME_TYPES", getAllMimeTypes()).setType(str).putExtra("android.intent.extra.ALLOW_MULTIPLE", this.maxSelectionCount > 1);
            intentPutExtra.getClass();
            return intentPutExtra;
        }
        if (i == 2) {
            return getNativePickerIntent(getDocumentMimeTypes());
        }
        if (i == 3) {
            return MediaPickerButtonKt.isPhotoPickerAvailable() ? getPhotoPickerIntent((String[]) gz3.r(getImageMimeTypes(), getVideoMimeTypes())) : getNativePickerIntent((String[]) gz3.r(getImageMimeTypes(), getVideoMimeTypes()));
        }
        if (i == 4) {
            return MediaPickerButtonKt.isPhotoPickerAvailable() ? getPhotoPickerIntent(getImageMimeTypes()) : getNativePickerIntent(getImageMimeTypes());
        }
        if (i == 5) {
            return MediaPickerButtonKt.isPhotoPickerAvailable() ? getPhotoPickerIntent(getVideoMimeTypes()) : getNativePickerIntent(getVideoMimeTypes());
        }
        u.b();
        return null;
    }

    private final List<String> getMimeTypesForExtension(String str) {
        Map<String, List<String>> map = ADDITIONAL_MIME_TYPES;
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        List<String> list = map.get(lowerCase);
        List<String> listH = hf3.t;
        if (list == null) {
            list = listH;
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(str);
        if (mimeTypeFromExtension != null) {
            listH = ws0.h(mimeTypeFromExtension);
        }
        return th1.T(th1.W(th1.K(list, listH)));
    }

    private final Intent getNativePickerIntent(String[] strArr) {
        Intent intentPutExtra = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType((String) u30.w(strArr)).putExtra("android.intent.extra.MIME_TYPES", strArr).addFlags(1).putExtra("android.intent.extra.ALLOW_MULTIPLE", this.maxSelectionCount > 1);
        intentPutExtra.getClass();
        return intentPutExtra;
    }

    private final Intent getPhotoPickerIntent(String[] strArr) {
        Intent intent = new Intent("android.provider.action.PICK_IMAGES");
        intent.putExtra("android.intent.extra.MIME_TYPES", strArr);
        int i = this.maxSelectionCount;
        if (i <= 1) {
            return intent;
        }
        if (i <= MediaStore.getPickImagesMaxLimit()) {
            intent.putExtra("android.provider.extra.PICK_IMAGES_MAX", this.maxSelectionCount);
            return intent;
        }
        z90.a("Max items must be less or equals MediaStore.getPickImagesMaxLimit()");
        return null;
    }

    private final String[] getVideoMimeTypes() {
        String[] allMimeTypes = getAllMimeTypes();
        ArrayList arrayList = new ArrayList();
        for (String str : allMimeTypes) {
            if (z2a.o(str, "video", false)) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    @Override // defpackage.o9
    public Intent createIntent(Context context, String str) {
        context.getClass();
        str.getClass();
        return getIntent(str);
    }

    @Override // defpackage.o9
    public List<? extends Uri> parseResult(int i, Intent intent) {
        List<Uri> clipDataUris;
        if (i != -1) {
            intent = null;
        }
        return (intent == null || (clipDataUris = getClipDataUris(intent)) == null) ? hf3.t : clipDataUris;
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public /* synthetic */ Companion(qq2 qq2Var) {
            this();
        }

        public final Map<String, List<String>> getADDITIONAL_MIME_TYPES() {
            return IntercomMediaPicker.ADDITIONAL_MIME_TYPES;
        }

        private Companion() {
        }
    }
}

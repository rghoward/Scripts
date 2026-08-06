package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import defpackage.ac4;
import defpackage.wfb;
import io.intercom.android.sdk.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomFakeComposerBinding implements wfb {
    public final EditText composerInputView;
    private final EditText rootView;

    private IntercomFakeComposerBinding(EditText editText, EditText editText2) {
        this.rootView = editText;
        this.composerInputView = editText2;
    }

    public static IntercomFakeComposerBinding bind(View view) {
        if (view != null) {
            EditText editText = (EditText) view;
            return new IntercomFakeComposerBinding(editText, editText);
        }
        ac4.c("rootView");
        return null;
    }

    public static IntercomFakeComposerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.intercom_fake_composer, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public EditText getRoot() {
        return this.rootView;
    }

    public static IntercomFakeComposerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}

package com.hwpo_training_app.leaderboards.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.material.textview.MaterialTextView;
import com.hwpo_training_app.R;
import defpackage.ac4;
import defpackage.nt3;
import defpackage.wfb;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class LayoutGymFilterBinding implements wfb {
    public final View a;
    public final View b;
    public final MaterialTextView c;
    public final View d;
    public final ImageView e;
    public final MaterialTextView f;

    public LayoutGymFilterBinding(View view, View view2, MaterialTextView materialTextView, View view3, ImageView imageView, MaterialTextView materialTextView2) {
        this.a = view;
        this.b = view2;
        this.c = materialTextView;
        this.d = view3;
        this.e = imageView;
        this.f = materialTextView2;
    }

    public static LayoutGymFilterBinding bind(View view) {
        int i = R.id.chooseGymCta;
        View viewB = nt3.b(R.id.chooseGymCta, view);
        if (viewB != null) {
            i = R.id.chooseGymText;
            if (((MaterialTextView) nt3.b(R.id.chooseGymText, view)) != null) {
                i = R.id.chosenGymName;
                MaterialTextView materialTextView = (MaterialTextView) nt3.b(R.id.chosenGymName, view);
                if (materialTextView != null) {
                    i = R.id.divider;
                    View viewB2 = nt3.b(R.id.divider, view);
                    if (viewB2 != null) {
                        i = R.id.labelFilterByGym;
                        if (((MaterialTextView) nt3.b(R.id.labelFilterByGym, view)) != null) {
                            i = R.id.myGymCheckMark;
                            ImageView imageView = (ImageView) nt3.b(R.id.myGymCheckMark, view);
                            if (imageView != null) {
                                i = R.id.myGymText;
                                MaterialTextView materialTextView2 = (MaterialTextView) nt3.b(R.id.myGymText, view);
                                if (materialTextView2 != null) {
                                    return new LayoutGymFilterBinding(view, viewB, materialTextView, viewB2, imageView, materialTextView2);
                                }
                            }
                        }
                    }
                }
            }
        }
        ac4.c("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static LayoutGymFilterBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.layout_gym_filter, viewGroup);
            return bind(viewGroup);
        }
        ac4.c("parent");
        return null;
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }
}

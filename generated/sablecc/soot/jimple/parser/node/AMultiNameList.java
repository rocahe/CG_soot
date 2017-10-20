/* This file was generated by SableCC (http://www.sablecc.org/). */

package soot.jimple.parser.node;

import soot.jimple.parser.analysis.*;

@SuppressWarnings("nls")
public final class AMultiNameList extends PNameList
{
    private PName _name_;
    private TComma _comma_;
    private PNameList _nameList_;

    public AMultiNameList()
    {
        // Constructor
    }

    public AMultiNameList(
        @SuppressWarnings("hiding") PName _name_,
        @SuppressWarnings("hiding") TComma _comma_,
        @SuppressWarnings("hiding") PNameList _nameList_)
    {
        // Constructor
        setName(_name_);

        setComma(_comma_);

        setNameList(_nameList_);

    }

    @Override
    public Object clone()
    {
        return new AMultiNameList(
            cloneNode(this._name_),
            cloneNode(this._comma_),
            cloneNode(this._nameList_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMultiNameList(this);
    }

    public PName getName()
    {
        return this._name_;
    }

    public void setName(PName node)
    {
        if(this._name_ != null)
        {
            this._name_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._name_ = node;
    }

    public TComma getComma()
    {
        return this._comma_;
    }

    public void setComma(TComma node)
    {
        if(this._comma_ != null)
        {
            this._comma_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._comma_ = node;
    }

    public PNameList getNameList()
    {
        return this._nameList_;
    }

    public void setNameList(PNameList node)
    {
        if(this._nameList_ != null)
        {
            this._nameList_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._nameList_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._name_)
            + toString(this._comma_)
            + toString(this._nameList_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._name_ == child)
        {
            this._name_ = null;
            return;
        }

        if(this._comma_ == child)
        {
            this._comma_ = null;
            return;
        }

        if(this._nameList_ == child)
        {
            this._nameList_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._name_ == oldChild)
        {
            setName((PName) newChild);
            return;
        }

        if(this._comma_ == oldChild)
        {
            setComma((TComma) newChild);
            return;
        }

        if(this._nameList_ == oldChild)
        {
            setNameList((PNameList) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}

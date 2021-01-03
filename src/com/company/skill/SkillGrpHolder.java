package com.company.skill;

public class SkillGrpHolder {

    private final int _skillID;
    private final int _skillLevel;
    private final int _operateType;
    private final int _resistCast;
    private final int _magicType;
    private final int _mpConsume;
    private final int _castRange;
    private final int _castStyle;
    private final float _hitTime;
    private final float _coolTime;
    private final int _effectPoint;
    private final int _isMagic;
    private final int _originskill;
    private final int _isDouble;
    private final int _animation;
    private final int _visualEffect;
    private final int _icon;
    private final int _debuff;
    private final int _iconType;
    private final int _enchantLevel;
    private final int _enchantIcon;
    private final int _hpConsume;
    private final int _rumbleSelf;
    private final int _rumbletarget;


    public SkillGrpHolder(int skillID, int skillLevel, int skillSublevels, int operateType, int resistCast, int magicType, int mpConsume, int castRange, int castStyle, float hitTime, float coolTime, float reuseDelay, int effectPoint, int isMagic, int originskill, int isDouble, int animation, int visualEffect, int icon, int iconPanel, int debuff, int iconType, int enchantLevel, int enchantIcon, int hpConsume, int rumbleSelf, int rumbletarget) {
        _skillID = skillID;
        _skillLevel = skillLevel;
        _operateType = operateType;
        _resistCast = resistCast;
        _magicType = magicType;
        _mpConsume = mpConsume;
        _castRange = castRange;
        _castStyle = castStyle;
        _hitTime = hitTime;
        _coolTime = coolTime;
        _effectPoint = effectPoint;
        _isMagic = isMagic;
        _originskill = originskill;
        _isDouble = isDouble;
        _animation = animation;
        _visualEffect = visualEffect;
        _icon = icon;
        _debuff = debuff;
        _iconType = iconType;
        _enchantLevel = enchantLevel;
        _enchantIcon = enchantIcon;
        _hpConsume = hpConsume;
        _rumbleSelf = rumbleSelf;
        _rumbletarget = rumbletarget;
    }

    public int getSkillID() {
        return _skillID;
    }

    public int getSkillLevel() {
        return _skillLevel;
    }

    public int getOperateType() {
        return _operateType;
    }

    public int getResistCast() {
        return _resistCast;
    }

    public int getMagicType() {
        return _magicType;
    }

    public int getMpConsume() {
        return _mpConsume;
    }

    public int getCastRange() {
        return _castRange;
    }

    public int getCastStyle() {
        return _castStyle;
    }

    public float getHitTime() {
        return _hitTime;
    }

    public float getCoolTime() {
        return _coolTime;
    }

    public int getEffectPoint() {
        return _effectPoint;
    }

    public int getIsMagic() {
        return _isMagic;
    }

    public int getOriginskill() {
        return _originskill;
    }

    public int getIsDouble() {
        return _isDouble;
    }

    public int getAnimation() {
        return _animation;
    }

    public int getVisualEffect() {
        return _visualEffect;
    }

    public int getIcon() {
        return _icon;
    }

    public int getDebuff() {
        return _debuff;
    }

    public int getIconType() {
        return _iconType;
    }

    public int getEnchantLevel() {
        return _enchantLevel;
    }

    public int getEnchantIcon() {
        return _enchantIcon;
    }

    public int getHpConsume() {
        return _hpConsume;
    }

    public int getRumbleSelf() {
        return _rumbleSelf;
    }

    public int getRumbletarget() {
        return _rumbletarget;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SkillGrpHolder that = (SkillGrpHolder) o;

        if (_skillID != that._skillID) return false;
        if (_skillLevel != that._skillLevel) return false;
        if (_operateType != that._operateType) return false;
        if (_resistCast != that._resistCast) return false;
        if (_magicType != that._magicType) return false;
        if (_mpConsume != that._mpConsume) return false;
        if (_castRange != that._castRange) return false;
        if (_castStyle != that._castStyle) return false;
        if (Float.compare(that._hitTime, _hitTime) != 0) return false;
        if (Float.compare(that._coolTime, _coolTime) != 0) return false;
        if (_effectPoint != that._effectPoint) return false;
        if (_isMagic != that._isMagic) return false;
        if (_originskill != that._originskill) return false;
        if (_isDouble != that._isDouble) return false;
        if (_animation != that._animation) return false;
        if (_visualEffect != that._visualEffect) return false;
        if (_icon != that._icon) return false;
        if (_debuff != that._debuff) return false;
        if (_iconType != that._iconType) return false;
        if (_enchantLevel != that._enchantLevel) return false;
        if (_enchantIcon != that._enchantIcon) return false;
        if (_hpConsume != that._hpConsume) return false;
        if (_rumbleSelf != that._rumbleSelf) return false;
        return _rumbletarget == that._rumbletarget;
    }

    @Override
    public int hashCode() {
        int result = _skillID;
        result = 31 * result + _skillLevel;
        result = 31 * result + _operateType;
        result = 31 * result + _resistCast;
        result = 31 * result + _magicType;
        result = 31 * result + _mpConsume;
        result = 31 * result + _castRange;
        result = 31 * result + _castStyle;
        result = 31 * result + (_hitTime != +0.0f ? Float.floatToIntBits(_hitTime) : 0);
        result = 31 * result + (_coolTime != +0.0f ? Float.floatToIntBits(_coolTime) : 0);
        result = 31 * result + _effectPoint;
        result = 31 * result + _isMagic;
        result = 31 * result + _originskill;
        result = 31 * result + _isDouble;
        result = 31 * result + _animation;
        result = 31 * result + _visualEffect;
        result = 31 * result + _icon;
        result = 31 * result + _debuff;
        result = 31 * result + _iconType;
        result = 31 * result + _enchantLevel;
        result = 31 * result + _enchantIcon;
        result = 31 * result + _hpConsume;
        result = 31 * result + _rumbleSelf;
        result = 31 * result + _rumbletarget;
        return result;
    }


    @Override
    public String toString() {
        return "SkillGrpHolder{" +
                "_skillID=" + _skillID +
                ", _skillLevel=" + _skillLevel +
                ", _operateType=" + _operateType +
                ", _resistCast=" + _resistCast +
                ", _magicType=" + _magicType +
                ", _mpConsume=" + _mpConsume +
                ", _castRange=" + _castRange +
                ", _castStyle=" + _castStyle +
                ", _hitTime=" + _hitTime +
                ", _coolTime=" + _coolTime +
                ", _effectPoint=" + _effectPoint +
                ", _isMagic=" + _isMagic +
                ", _originskill=" + _originskill +
                ", _isDouble=" + _isDouble +
                ", _animation=" + _animation +
                ", _visualEffect=" + _visualEffect +
                ", _icon=" + _icon +
                ", _debuff=" + _debuff +
                ", _iconType=" + _iconType +
                ", _enchantLevel=" + _enchantLevel +
                ", _enchantIcon=" + _enchantIcon +
                ", _hpConsume=" + _hpConsume +
                ", _rumbleSelf=" + _rumbleSelf +
                ", _rumbletarget=" + _rumbletarget +
                '}';
    }
}

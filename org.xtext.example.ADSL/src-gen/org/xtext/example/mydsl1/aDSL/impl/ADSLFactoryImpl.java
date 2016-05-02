/**
 * generated by Xtext 2.9.0
 */
package org.xtext.example.mydsl1.aDSL.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.mydsl1.aDSL.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ADSLFactoryImpl extends EFactoryImpl implements ADSLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ADSLFactory init()
  {
    try
    {
      ADSLFactory theADSLFactory = (ADSLFactory)EPackage.Registry.INSTANCE.getEFactory(ADSLPackage.eNS_URI);
      if (theADSLFactory != null)
      {
        return theADSLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ADSLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ADSLFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case ADSLPackage.PROGRAM: return createProgram();
      case ADSLPackage.ABSTRACT_ELEMENTS: return createAbstractElements();
      case ADSLPackage.XCLASS: return createXClass();
      case ADSLPackage.MEMBER: return createMember();
      case ADSLPackage.MAIN_METHOD: return createMainMethod();
      case ADSLPackage.PRINT_INST: return createPrintInst();
      case ADSLPackage.METHOD: return createMethod();
      case ADSLPackage.OPERATOR: return createOperator();
      case ADSLPackage.FUNC_VAR_DEF: return createFuncVarDef();
      case ADSLPackage.VARIABLE_DEF: return createVariableDef();
      case ADSLPackage.SHARED_ARRAY_DEF: return createSharedArrayDef();
      case ADSLPackage.SHARED_VAR_DEF: return createSharedVarDef();
      case ADSLPackage.PARAMETER: return createParameter();
      case ADSLPackage.BODY: return createBody();
      case ADSLPackage.BLOCK: return createBlock();
      case ADSLPackage.VARIABLE_TYPE: return createVariableType();
      case ADSLPackage.STATEMENT: return createStatement();
      case ADSLPackage.ASYNC_STAT: return createAsyncStat();
      case ADSLPackage.FINISH_STAT: return createFinishStat();
      case ADSLPackage.AT_STAT: return createAtStat();
      case ADSLPackage.ATOMIC_STATEMENT: return createAtomicStatement();
      case ADSLPackage.WHEN_STATEMENT: return createWhenStatement();
      case ADSLPackage.FOR2_STATEMENT: return createFor2Statement();
      case ADSLPackage.VAR_DEF: return createVarDef();
      case ADSLPackage.SHARED_DEF: return createSharedDef();
      case ADSLPackage.EXPRESSION: return createExpression();
      case ADSLPackage.INTEGER_NEGATIVE: return createIntegerNegative();
      case ADSLPackage.TRY_CATCH_STAT: return createTryCatchStat();
      case ADSLPackage.WHILE_STAT: return createWhileStat();
      case ADSLPackage.FOR_STAT: return createForStat();
      case ADSLPackage.RETURN_STAT: return createReturnStat();
      case ADSLPackage.IF_STAT: return createIfStat();
      case ADSLPackage.ASSIGNMENT: return createAssignment();
      case ADSLPackage.MEMBER_SELECTION: return createMemberSelection();
      case ADSLPackage.OR: return createOr();
      case ADSLPackage.AND: return createAnd();
      case ADSLPackage.EQUALITY: return createEquality();
      case ADSLPackage.COMPARISON: return createComparison();
      case ADSLPackage.PLUS: return createPlus();
      case ADSLPackage.MINUS: return createMinus();
      case ADSLPackage.MUL_OR_DIV: return createMulOrDiv();
      case ADSLPackage.NOT: return createNot();
      case ADSLPackage.STRING_CONSTANT: return createStringConstant();
      case ADSLPackage.INT_CONSTANT: return createIntConstant();
      case ADSLPackage.BOOL_CONSTANT: return createBoolConstant();
      case ADSLPackage.DE_REF: return createDeRef();
      case ADSLPackage.THIS: return createThis();
      case ADSLPackage.NULL: return createNull();
      case ADSLPackage.HERE: return createHere();
      case ADSLPackage.REFERENCE: return createReference();
      case ADSLPackage.NEW: return createNew();
      case ADSLPackage.INIT: return createInit();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Program createProgram()
  {
    ProgramImpl program = new ProgramImpl();
    return program;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractElements createAbstractElements()
  {
    AbstractElementsImpl abstractElements = new AbstractElementsImpl();
    return abstractElements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XClass createXClass()
  {
    XClassImpl xClass = new XClassImpl();
    return xClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Member createMember()
  {
    MemberImpl member = new MemberImpl();
    return member;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MainMethod createMainMethod()
  {
    MainMethodImpl mainMethod = new MainMethodImpl();
    return mainMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrintInst createPrintInst()
  {
    PrintInstImpl printInst = new PrintInstImpl();
    return printInst;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Method createMethod()
  {
    MethodImpl method = new MethodImpl();
    return method;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operator createOperator()
  {
    OperatorImpl operator = new OperatorImpl();
    return operator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FuncVarDef createFuncVarDef()
  {
    FuncVarDefImpl funcVarDef = new FuncVarDefImpl();
    return funcVarDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableDef createVariableDef()
  {
    VariableDefImpl variableDef = new VariableDefImpl();
    return variableDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SharedArrayDef createSharedArrayDef()
  {
    SharedArrayDefImpl sharedArrayDef = new SharedArrayDefImpl();
    return sharedArrayDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SharedVarDef createSharedVarDef()
  {
    SharedVarDefImpl sharedVarDef = new SharedVarDefImpl();
    return sharedVarDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter createParameter()
  {
    ParameterImpl parameter = new ParameterImpl();
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Body createBody()
  {
    BodyImpl body = new BodyImpl();
    return body;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Block createBlock()
  {
    BlockImpl block = new BlockImpl();
    return block;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableType createVariableType()
  {
    VariableTypeImpl variableType = new VariableTypeImpl();
    return variableType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement createStatement()
  {
    StatementImpl statement = new StatementImpl();
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AsyncStat createAsyncStat()
  {
    AsyncStatImpl asyncStat = new AsyncStatImpl();
    return asyncStat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FinishStat createFinishStat()
  {
    FinishStatImpl finishStat = new FinishStatImpl();
    return finishStat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AtStat createAtStat()
  {
    AtStatImpl atStat = new AtStatImpl();
    return atStat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AtomicStatement createAtomicStatement()
  {
    AtomicStatementImpl atomicStatement = new AtomicStatementImpl();
    return atomicStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WhenStatement createWhenStatement()
  {
    WhenStatementImpl whenStatement = new WhenStatementImpl();
    return whenStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public For2Statement createFor2Statement()
  {
    For2StatementImpl for2Statement = new For2StatementImpl();
    return for2Statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VarDef createVarDef()
  {
    VarDefImpl varDef = new VarDefImpl();
    return varDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SharedDef createSharedDef()
  {
    SharedDefImpl sharedDef = new SharedDefImpl();
    return sharedDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerNegative createIntegerNegative()
  {
    IntegerNegativeImpl integerNegative = new IntegerNegativeImpl();
    return integerNegative;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TryCatchStat createTryCatchStat()
  {
    TryCatchStatImpl tryCatchStat = new TryCatchStatImpl();
    return tryCatchStat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WhileStat createWhileStat()
  {
    WhileStatImpl whileStat = new WhileStatImpl();
    return whileStat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ForStat createForStat()
  {
    ForStatImpl forStat = new ForStatImpl();
    return forStat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReturnStat createReturnStat()
  {
    ReturnStatImpl returnStat = new ReturnStatImpl();
    return returnStat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IfStat createIfStat()
  {
    IfStatImpl ifStat = new IfStatImpl();
    return ifStat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assignment createAssignment()
  {
    AssignmentImpl assignment = new AssignmentImpl();
    return assignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MemberSelection createMemberSelection()
  {
    MemberSelectionImpl memberSelection = new MemberSelectionImpl();
    return memberSelection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Or createOr()
  {
    OrImpl or = new OrImpl();
    return or;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public And createAnd()
  {
    AndImpl and = new AndImpl();
    return and;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Equality createEquality()
  {
    EqualityImpl equality = new EqualityImpl();
    return equality;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Comparison createComparison()
  {
    ComparisonImpl comparison = new ComparisonImpl();
    return comparison;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Plus createPlus()
  {
    PlusImpl plus = new PlusImpl();
    return plus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Minus createMinus()
  {
    MinusImpl minus = new MinusImpl();
    return minus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MulOrDiv createMulOrDiv()
  {
    MulOrDivImpl mulOrDiv = new MulOrDivImpl();
    return mulOrDiv;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Not createNot()
  {
    NotImpl not = new NotImpl();
    return not;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringConstant createStringConstant()
  {
    StringConstantImpl stringConstant = new StringConstantImpl();
    return stringConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntConstant createIntConstant()
  {
    IntConstantImpl intConstant = new IntConstantImpl();
    return intConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BoolConstant createBoolConstant()
  {
    BoolConstantImpl boolConstant = new BoolConstantImpl();
    return boolConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeRef createDeRef()
  {
    DeRefImpl deRef = new DeRefImpl();
    return deRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public This createThis()
  {
    ThisImpl this_ = new ThisImpl();
    return this_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Null createNull()
  {
    NullImpl null_ = new NullImpl();
    return null_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Here createHere()
  {
    HereImpl here = new HereImpl();
    return here;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Reference createReference()
  {
    ReferenceImpl reference = new ReferenceImpl();
    return reference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public New createNew()
  {
    NewImpl new_ = new NewImpl();
    return new_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Init createInit()
  {
    InitImpl init = new InitImpl();
    return init;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ADSLPackage getADSLPackage()
  {
    return (ADSLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ADSLPackage getPackage()
  {
    return ADSLPackage.eINSTANCE;
  }

} //ADSLFactoryImpl
